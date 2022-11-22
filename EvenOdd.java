import java.util.Random;
class EvenOdd extends Thread
{
    public void run()
    {
        Random rd=new Random();
        for(int i=0;i<5;i++)
        {
            int x=rd.nextInt(50);
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            if(x%2==0)
            {
                System.out.println("Square of "+x+" is "+x*x);
            }
            else
            {
                System.out.println("Cube of "+x+" is "+x*x*x);
            }
        }
    }
    public static void main(String[] args)
    {
        EvenOdd e=new EvenOdd();
        e.start();
    }
}