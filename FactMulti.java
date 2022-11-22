import java.util.Random;

class Factorial extends Thread
{
  int x=0;
  Factorial(int x)
  {
    this.x=x;
  }
  public void run()
  {
      double fact=1;
      for(int i=1;i<=x;i++)
      {
        fact=fact*i;
      }
      System.out.println("Factorial of " +x+ " is "+fact);
  }
}

class FactMulti extends Thread {

  public void run() {
    Random rd = new Random();
    for (int i = 0; i < 5; i++) {
      int x = rd.nextInt(0, 50);
      try{
        sleep(5000);
      }
      catch(InterruptedException e)
      {
        System.out.println(e);
      }
      Factorial f=new Factorial(x);
      f.start();
    }
  }

  public static void main(String[] args) {
    FactMulti f = new FactMulti();
    f.start();
  }
}
