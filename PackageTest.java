// import p1.Stat;
// import p1.Arithmatic;
// import p1.Trig;
import p1.*;
import java.util.Scanner;
class PackageTest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 nos for Arithmetic Operation :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Arithmatic a=new Arithmatic(x, y);
        System.out.println("Addition = "+a.sum());
        System.out.println("Substraction = "+a.sub());
        System.out.println("Multiplication = "+a.multi());
        System.out.println("Division = "+a.div());
        System.out.println();
        System.out.print("Enter size of data : ");
        int size = sc.nextInt();
        Stat s=new Stat(size);
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter data :");
            int data=sc.nextInt();
            s.setdata(data,i);
        }
        System.out.println("Sum = "+s.sum());
        System.out.println("Minimum = "+s.min());
        System.out.println("Maximum = "+s.max());
        System.out.println("Count = "+s.count());
        System.out.println("Average = "+s.avg());
        System.out.println();

        System.out.print("Enter angle in degree :");
        int deg=sc.nextInt();
        Trig t=new Trig(deg);
        System.out.println("Sin = "+t.sine());
        System.out.println("cos = "+t.cosine());
        System.out.println("Tan = "+t.tang());
        System.out.println("cosec = "+t.cosec());
        System.out.println("sec = "+t.sec());
        System.out.println("cot = "+t.cot());
    }
}