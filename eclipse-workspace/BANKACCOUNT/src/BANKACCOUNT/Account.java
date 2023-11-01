package BANKACCOUNT;




 class BankAccount {
    int acNo;
    String acName, acPhone, acEmail;
    double acBal;
    
    public BankAccount(int acNo, String acName, String acPhone, String acEmail,double acBal )
    {
        this.acNo=acNo;
        this.acName=acName;
        this.acPhone=acPhone;
        this.acEmail=acEmail;
        this.acBal=acBal;
    }
  public void accountholder()
    {   
    	System.out.println("Account Number: " + acNo);
        System.out.println("Account Holder Name: " + acName);
        System.out.println("Account Holder Address: " + acEmail);
        System.out.println("Account Holder Phone Number: " + acPhone);
        System.out.println("Account Holder Balance: $" + acBal);
    }
  public void deposit(double amount) {
	  acBal += amount;
	  System.out.println("Deposited: $"+amount);
  }
  public void displayBalance() {
	    System.out.println("Account Number: " + acNo);
	    System.out.println("Balance: $" + acBal);
	}
  }
class SavingsAccount extends BankAccount{

	public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		super(acNo, acName, acPhone, acEmail, acBal);

	} 	  
  }
class CurrentAccount extends BankAccount{
public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		super(acNo, acName, acPhone, acEmail, acBal);
   }
}

public  class  Account{
	public static void main(String[] args) {
		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingsAccount SAC= new SavingsAccount(1001, "EMMANUEL KIBET", "0724282324","emmanuelkibet868@gmail.com",1000);
		SAC.accountholder();
		SAC.deposit(500);
		SAC.displayBalance();
		System.out.println("\n");
		System.out.println("CURRENT  ACCOUNT DETAILS");
		CurrentAccount CAC=new CurrentAccount(1001,"JYDEN SMITH", "0712345678","jaydensmith868@gmail.com",300);
		CAC.accountholder();
		CAC.deposit(300);
		CAC.displayBalance();
       }
  }
