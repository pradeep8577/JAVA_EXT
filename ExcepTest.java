import java.util.Scanner;
class MyException extends Exception 
{
    MyException(String str) 
    {
        super(str);
    }
}

class ExepOper 
{
    int x, y;
    ExepOper(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    void sum() throws MyException 
    {
        try 
        {
            if (x + y > 1000) 
            {
                throw new MyException("ToLongAddition");
            } 
            else 
            { 
                System.out.println("sum = "+(x+y));
            }
        } 
        catch (MyException e) 
        {
            System.out.println(e);
        }
    }
    void sub() throws MyException
    {
        try
        {
            if(x-y<0)
            {
                throw new MyException("NegativeSubstraction");
            }
            else
            {
                System.out.println("Sub = "+(x-y));
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
    void multi() throws MyException
    {
        try
        {
            if(x*y>5000)
            {
                throw new MyException("ToLongMultiplication");
            }
            else
            {
                System.out.println("Multiplication = "+(x*y));
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
    void div() throws MyException
    {
        try
        {
            if(y==0)
            {
                throw new MyException("DivideByZero");
            }
            else
            {
                System.out.println("Division = "+(x/y));
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}

class ExcepTest
{
    public static void main(String[] args) throws MyException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        ExepOper eo=new ExepOper(x, y);
        eo.sum();
        eo.sub();
        eo.multi();
        eo.div();
    }
}
