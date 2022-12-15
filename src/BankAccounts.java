import java.util.*;
public class BankAccounts {
	
	String userName;
	String password;
    String name;
   
	String accountNo;
	float balance = 10000f;
    String transactionHistory = "";

	int transaction = 0;
	

	public void userRegisterScreen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Your Name : ");
		this.name = sc.nextLine();
		System.out.print("\nEnter Your Username : ");
		this.userName = sc.nextLine();
		System.out.print("\nEnter Your Password : ");
		this.password = sc.nextLine();
		System.out.print("\nEnter Your Account Number : ");
		this.accountNo = sc.nextLine();
    System.out.println("************************************************");    

		System.out.println("Registration is completed Please login");
    System.out.println("************************************************");    

	}
	
	public boolean loginScreen() {
		boolean isLogin = false;
		Scanner sc = new Scanner(System.in);
		while ( !isLogin ) {
			System.out.print("\nEnter Your Username : ");
			String user_name = sc.nextLine();
			if ( user_name.equals(userName) ) {
				while ( !isLogin ) {
					System.out.print("\nEnter Your Password : ");
					String Password = sc.nextLine();
					if ( Password.equals(password) ) {
            System.out.println("*********************************************");    

						System.out.print("Login successfull!!!\n");
            System.out.println("*********************************************");    

						isLogin = true;
					}
					else {
						System.out.println("\nIncorrect Password");
					}
				}
			}
			else {
				System.out.println("\nUsername not found");
			}
		}
		return isLogin;
	}
	
	/* public void withdrawScreen() {
		
		System.out.print("\nEnter amount to withdraw - ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		try {
			
			if ( balance >= 20000 ) {
				transaction++;
				balance -= amount;
				System.out.println("\nWithdraw Successfully");
				String str = amount + " Rs Withdrawed\n";
				transactionHistory = transactionHistory.concat(str);

          
				
				
			}
            else {
				System.out.println("\nInsufficient Balance");
			
           
			
			}
            
		}
		catch ( Exception e) {
		}
	} */
	
    public void withdrawScreen() {
		
        System.out.print("\nEnter amount to withdraw - ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		try {
			if ( balance >= amount ) {
				if ( amount <= 20000f ) {
					transaction++;
					balance -= amount;
        System.out.println("*********************************************");    

					System.out.println("Withdraw Successfully");
        System.out.println("*********************************************");    

				String str = amount + " Rs Withdrawed\n";
				transactionHistory = transactionHistory.concat(str);
				}
				else {
					System.out.println("\nSorry Amount Limit is 20000.00");
				}
			}
			else {
				System.out.println("\nInsufficient Balance!!");
			}
		}
		catch ( Exception e) {
		}
	}


	public void depositScreen() {
		
		System.out.print("\nEnter amount to deposit : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		try {
			if ( amount <= 20000f ) {
				transaction++;
				balance += amount;
        System.out.println("*********************************************");    

				System.out.println("Successfully Deposited!!");
        System.out.println("*********************************************");    

				String str = amount + " Rs deposited\n";
				transactionHistory = transactionHistory.concat(str);
			}
			else {
				System.out.println("\nSorry Amount Limit is 20000.00");
			}
			
		}
		catch ( Exception e) {
		}
	}
	
	
	
	public void checkBalanceScreen() {
		System.out.println("\n" + balance + " Rs");
	}
	
	public void transHistoryScreen() {
		if ( transaction == 0 ) {
			System.out.println("\nEmpty");
		}
		else {
			System.out.println("\n" + transactionHistory);
		}
	}

    public void transferScreen() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Receipent's Name : ");
		String receipent = sc.nextLine();
		System.out.print("\nEnter amount to transfer : ");
		float amount = sc.nextFloat();
		
		try {
			if ( balance >= amount ) {
				if ( amount <= 20000f ) {
					transaction++;
					balance -= amount;
                System.out.println("*********************************************");    
                   System.out.println("Successfully Transfered to " + receipent);
                System.out.println("*********************************************");
                          String str = amount + " Rs transfered to " + receipent + "\n";
					transactionHistory = transactionHistory.concat(str);
				}
				else {
					System.out.println("\nSorry Amount Limit is 20000.00");
				}
			}
			else {
				System.out.println("\nInsufficient Balance!!");
			}
		}
		catch ( Exception e) {
		}
	}

    
}

