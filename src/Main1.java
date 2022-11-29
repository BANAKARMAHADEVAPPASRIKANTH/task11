class TestAccountInterface
{
    public static void main(String s[])
    {
        IAccount account = new HDFCAccount();

        System.out.println("HDFC ");
        transactOnAccount(account);
        System.out.println();

        account = new StateBankAccount();

        System.out.println("SBI");
        transactOnAccount(account);
    }

    public static void transactOnAccount(IAccount account)
    {

        account.deposit(800);
        printBalance("deposit  ", account);
        account.withdraw(10);
        printBalance("withdraw  ", account);
        account.withdraw(20);
        printBalance("withdraw   ", account);
        account.deposit(2800);
        printBalance("deposit  ", account);

    }

    public static void printBalance(String message, IAccount account)
    {
        System.out.println("balance " + message + "     " + account.getBalance() +"  ");
    }

}

interface IAccount
{
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);
}

class HDFCAccount implements IAccount
{
    double deposits;
    double withdrawals;


    public double getBalance()
    {
        return deposits - withdrawals;
    }

    public void deposit(double amount)
    {
        deposits += amount;
    }

    public void withdraw(double amount)
    {
        withdrawals += amount;
    }
}

class StateBankAccount implements IAccount
{
    double balance;

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }
}