import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bank bank1 = new Bank("Jake", 90);
        // System.out.println(bank1.GetBalance());
        // System.out.println(bank1.GetBankBalance());
        // Bank bank2 = new Bank("Eric", 50);
        // System.out.println(bank2.GetBalance());
        // System.out.println(bank2.GetBankBalance());
        // Bank bank3 = new Bank("Peter", 100);
        // System.out.println(bank3.GetBalance());
        // System.out.println(bank3.GetBankBalance());


        // System.out.println(bank1.GetBankBalance());
        // System.out.println(bank1.AuthorizedUser);
        // System.out.println(bank1.GetBalance());
        // System.out.println(bank1.AccountType);
        // bank1.Deposit(500);
        // bank1.Deposit(50);
        // bank1.Deposit(10);
        // double currentBalance = bank1.GetBalance();
        // System.out.println(currentBalance);
        // bank1.Withdrawal(5);
        // currentBalance = bank1.GetBalance();
        // System.out.println(currentBalance);
        // bank1.Balance = 1000000000;

        // System.out.println(Bank.ConvertUSDtoAUD(1));

        // System.out.println(bank1);
        // bank1 = null;
        // try
        // {
        //     System.out.println(bank1.AuthorizedUser);

        // }


        // catch(NullPointerException e)
        // {
        //     System.out.println(e);
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Just a general exception happened");
        // }
        // finally
        // {

        // }

        // System.out.println(bank2.AuthorizedUser);

    //     String name = "Jake";
    //     switch(name)
    //     {
    //         case "Hank":
    //         System.out.println("Name is Hank");
    //         break;
    //         default:
    //         System.out.println("Name does not match");
    //     }

    // }

        EnterInt();

    }

    
    public static void EnterInt()
    {
         Scanner stdin = new Scanner(System.in);
        try {
        
        System.out.println("Enter an int: ");
        int value = stdin.nextInt();
        System.out.println("The square root of " + value + " is " + Math.sqrt(value));
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please make sure to enter Integers and not floats or doubles.");
        }
        stdin.close();

    }

}