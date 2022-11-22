import java.util.Scanner;
class AOper
{
    Scanner sc=new Scanner(System.in);
    int[][] arr;
    int rows,cols;
    AOper(int rows,int cols)
    {   
        arr=new int[rows][cols];
        this.rows=rows;
        this.cols=cols;
    }
    void setData()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter the array element at index "+i+" , "+j+" :");
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void addition(AOper a,AOper b)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=a.arr[i][j]+b.arr[i][j];
            }
        }
    }
    void substraction(AOper a,AOper b)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=a.arr[i][j]-b.arr[i][j];
            }
        }
    }
    void multiply(AOper a,AOper b)
    {
        for(int i=0;i<rows;i++)
        {
            
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=0;
                for(int k=0;k<cols;k++)
                arr[i][j]=arr[i][j]+a.arr[i][k]*b.arr[k][j];
            }
        }
    }
    void display()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class ArrayOper
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of matrix :");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        AOper a=new AOper(rows, cols);
        AOper b=new AOper(rows, cols);
        AOper c=new AOper(rows, cols);
        System.out.println("Enter data for matrix 1");
        a.setData();
        System.out.println("Enter data for matrix 2");
        b.setData();
        System.out.println("Matrix 1");
        a.display();
        System.out.println("Matrix 2");
        b.display();
        System.out.println("Addition Matrix");
        c.addition(a,b);
        c.display();
        System.out.println("Substraction Matrix");
        c.substraction(a,b);
        c.display();
        System.out.println("Multiplication Matrix");
        c.multiply(a,b);
        c.display();
    }
}