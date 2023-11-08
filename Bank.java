public class Bank {

    final String RoutingNumber = "88389633541";
    
    private static double BankBalance; // this balance will track the overall balance stored at the bank
    private double Balance;
    AccountTypeEnum AccountType;
    String AuthorizedUser;

    public Bank() {
        AccountType = AccountTypeEnum.CHECKING;
        AuthorizedUser= "";
    }

    public Bank(String incAuthorizedUser) {
        AccountType = AccountTypeEnum.CHECKING;
        this.AuthorizedUser = incAuthorizedUser;
    }
    
    public Bank(String incAuthorizedUser, double balance) {
        AccountType = AccountTypeEnum.CHECKING;
        this.AuthorizedUser = incAuthorizedUser;
        BankBalance += balance;
        Balance = balance;
    }

    public double GetBalance(){
        return Balance;
    }

    public double GetBankBalance() {
        return BankBalance;
    }

    public double Deposit(double amount){
        BankBalance += amount;
        return Balance += amount;
    }

    public double Withdrawal(double amount){
        double updatedBalance = Balance - amount;
        double rtnBalance = 0;

        if(updatedBalance >=0){
            Balance -= amount;
            BankBalance -= amount;
            rtnBalance = updatedBalance;
        } else {
            double zeroBalance = 0;
            Balance = zeroBalance;
            BankBalance -= Balance;
            rtnBalance = zeroBalance;
        }

        //System.out.println(zeroBalance);
        return rtnBalance;
    }

    public static double ConvertUSDtoAUD(double USD)
    {
        return BankBalance * 1.56;
    }



}