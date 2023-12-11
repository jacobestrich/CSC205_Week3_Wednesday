import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class BankTest 
{
    @Test()
    public void testGetBalanceShouldDefaultToZero()
    {
        //Arrange 
        Bank bank = new Bank();

        //Act
        double balance = bank.GetBalance();

        //Assert
        assertEquals(0, balance, 0);
    }

    @Test
    public void testGetBalanceShouldInitializeViaConstructor()
    {
        Bank bank = new Bank("Jake", 80);
        double balance = bank.GetBalance();
        assertEquals(80, balance, 0);
    }

    @Test
    public void testIfDepositIncreasesBalance()
    {
        Bank bank = new Bank();
        double InitialBalance = 25;
        double Deposit = bank.Deposit(50);
        double UpdatedBalance = Deposit + InitialBalance;    
        assertEquals(75, UpdatedBalance, 0);

    }

}
