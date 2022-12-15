import java.util.Scanner;


public class AtmInterfaceScreen {
	
	
	public static int integerInput(int limit) {
        boolean flag = false;

		int input = 0;
		
		while ( !flag ) {
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				flag = true;
				
				if ( flag && input > limit || input < 1 ) {
					System.out.println("Choose the number between 1 to " + limit);
					flag = false;
				}
			}
			catch ( Exception e ) {
				System.out.println("Enter only integer value!");
				flag = false;
			}
		};
		return input;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("\n*************WELCOME TO Bank Of Maharashtra ATM Service*************\n");
		System.out.println("1.Register \n2.Exit");
		System.out.print("Enter Your Choice - ");
		int choice = integerInput(2);
		
		if ( choice == 1 ) {
			BankAccounts bankAccountsObj = new BankAccounts();
			bankAccountsObj.userRegisterScreen();
			while(true) {
				System.out.println("\n1.Login \n2.Exit");
				System.out.print("Enter Your Choice : ");
				int ch = integerInput(2);
				if ( ch == 1 ) {
					if (bankAccountsObj.loginScreen()) {
						System.out.println("\n\n**********WELCOME BACK " + bankAccountsObj.name + " **********\n");
						boolean isFinished = false;
						while (!isFinished) {
							System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check Balance \n5.Transaction History \n6.Exit");
							System.out.print("\nEnter Your Choice : ");
							int c = integerInput(6);
							switch(c) {
								case 1:
								bankAccountsObj.withdrawScreen();
								break;
								case 2:
								bankAccountsObj.depositScreen();
								break;
								case 3:
								bankAccountsObj.transferScreen();
								break;
								case 4:
								bankAccountsObj.checkBalanceScreen();
								break;
								case 5:
								bankAccountsObj.transHistoryScreen();
								break;
								case 6:
								isFinished = true;
								break;
							}
						}
					}
				}
				else {
					System.exit(0);
				}
			}
		}
		else {
			System.exit(0);
		}
		
		
		
	}
}	