public class Main 
{

    public static void main(String[] args) 
    {
        Bank bank1 = new Bank();
        bank1.Deposit(500);
        bank1.Deposit(50);
        bank1.Deposit(10);

        System.out.println(bank1.GetBalance());

        bank1.Withdrawl(5.33);
        System.out.println(bank1.GetBalance());
    }
    

}