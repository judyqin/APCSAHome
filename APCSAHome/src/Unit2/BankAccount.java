package Unit2;

public class BankAccount
{
    private double balance;
    private double interest;
    public BankAccount()
    {
        setBankAccount(balance, interest);
    }
    public void setBankAccount(double initialBalance, double interestRate)
    {
        balance = initialBalance;
        interest = interestRate;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    } 
    public void addInterest() {
    	balance += balance * (interest);
    }
    public double getBalance()
    {
        return balance;
    }
}