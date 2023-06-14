class BankAccount
{
	//enacapsulating the balance amount//making it hidden from other classes
    private double balance;

    public double getBalance()
	{
        return balance;
    }

    public void setDeposit(double amount)
	{
        this.balance += amount;
    }

    public void setWithdraw(double amount)
	{
        this.balance -= amount;
    }

}
class BankAccountDriver
{
    public static void main(String[] args)
	{
        BankAccount account = new BankAccount();
		System.out.println("Balance Initial: " + account.getBalance());
        account.setDeposit(1000);
        System.out.println("Balance After Deposit: " + account.getBalance());
		account.setWithdraw(500);
        System.out.println("Balance After Withdraw: " + account.getBalance());
    }
}