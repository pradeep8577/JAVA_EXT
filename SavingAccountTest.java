import java.util.Scanner;
class SavingAccount
{
    static int annualInterestRate=4;
    private int accountBalance,balance;
    SavingAccount(int accountBalance)
    {
        this.accountBalance=accountBalance;
    }
    void monthlyInterest()
    {
        balance=accountBalance+((accountBalance*annualInterestRate)/12);
    }
    static void modifyInterestRate(int newIR)
    {
        annualInterestRate=newIR;
    }
    void display()
    {
        System.out.println("Balance = "+balance);
    }
}
class SavingAccountTest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Balance of saver1 :");
        int accountBalance=sc.nextInt();
        SavingAccount saver1=new SavingAccount(accountBalance);
        System.out.println("Enter balance of Saver2 :");
        accountBalance=sc.nextInt();
        SavingAccount saver2=new SavingAccount(accountBalance);
        System.out.println("Before Interest updation");
        saver1.monthlyInterest();
        System.out.println("Saver1");
        saver1.display();
        saver2.monthlyInterest();
        System.out.println("Saver2");
        saver2.display();
        SavingAccount.modifyInterestRate(5);
        System.out.println("After Interest updation");
        saver1.monthlyInterest();
        System.out.println("Saver1");
        saver1.display();
        saver2.monthlyInterest();
        System.out.println("Saver2");
        saver2.display();


    }
}