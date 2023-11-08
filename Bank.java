public class Bank
{
    private double Balance;

    public double GetBalance()
    {
        return Balance;
    }
    
    public double Deposit(double Amount)
    {
        return Balance += Amount;
    }

    public double Withdrawl(double Amount)
    {
        return Balance -= Amount;
    }

}