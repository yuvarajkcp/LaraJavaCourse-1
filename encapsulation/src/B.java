class BankAccount 
{
	private double balance;

	public double getBalance()
	{
		return balance;
	}

	public void deposit(double amount) //or setdeposit
	{
		this.balance += amount;
	}

	public void setwithdraw(double amount)
	{
		this.balance -= amount;
	}
	
}
class Customer
{
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		System.out.println("Balance Initial: " + account.getBalance());
		account.deposit(1000);
		System.out.println("Balance After Deposit: " + account.getBalance());
		account.setwithdraw(500);
		System.out.println("Balance After withdraw: " + account.getBalance());
	}
}
/*
D:\april-batch-lab\encapsulation\src>javac -d ../classes B.java

D:\april-batch-lab\encapsulation\src>java -cp ../classes Customer
Balance Initial: 0.0
Balance After Deposit: 1000.0
Balance After withdraw: 500.0
*/
