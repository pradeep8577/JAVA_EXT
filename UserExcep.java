import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}
class Operation 
{
        Scanner SC=new Scanner(System.in);
        void divide(int x,int y) throws MyException
        {
            try 
            {
                if (y==0)
                {
                    throw new MyException("Dividebyzero");
                }   
                else
                {
                    double z=y;
                    System.out.println(x+"/"+y+" = "+x/z);
                }
            } 
            catch(MyException e)
            {
                System.out.println(e);
            }
        }
    
        void arrayInd(int size) throws MyException
        {
            int arr[]=new int[size];
            System.out.println("Enter array Element");
            for(int i=0;i<size;i++)
            {
                arr[i]=SC.nextInt();
            }
            System.out.println("Enter index to access:");
            int index=SC.nextInt();
            try
            {
                if(index>size-1)
                {
                    throw new MyException("ArrayIndexOutOfBound");
                }
                else
                {
                    System.out.println("Element at index "+index+" is "+arr[index-1]);
                }
            }
            catch(MyException e)
            {
                System.out.println(e);
            }
        }

        void stringInd(String str) throws MyException
        {
            System.out.println("Enter index to access:");
            int index=SC.nextInt();
            try{
                if(index>str.length()-1)
                {
                    throw new MyException("StringIndexOutOfBound");
                }
                else
                {
                    System.out.println("Char at index "+index+" is "+str.charAt(index-1));;
                }
            }
            catch(MyException e)
            {
                System.out.println(e);
            }
        }
}
class UserExcep
{
    public static void main(String []args) throws MyException
    {
        Operation o=new Operation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x=sc.nextInt();
        System.out.println("Enter number 2:");
        int y=sc.nextInt();
        o.divide(x, y);

        System.out.println("Enter Size of array: ");
        int size=sc.nextInt();
        o.arrayInd(size);

        System.out.println("Enter the string:");
        sc.nextLine();
        String str=sc.nextLine();
        o.stringInd(str);
    }
}