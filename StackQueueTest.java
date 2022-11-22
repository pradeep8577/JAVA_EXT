import java.util.Scanner;
interface Stack
{
    int push(int data);
    int pop();
    void sdisplay();
    int peek();
}
interface Queue
{
    int enqueue(int data);
    int dequeue();
    void qdisplay();
}
class StackQueue implements Stack,Queue
{
    int top,sizes,sizeq,front,rear;
    int sarr[],qarr[];
    StackQueue(int sizes,int sizeq)
    {
        top=-1;
        front=-1;
        rear=-1;
        this.sizes=sizes;
        this.sizeq=sizeq;
        sarr=new int [sizes];
        qarr=new int [sizeq];
    }
    public int push(int data)
    {
        if(top==sizes)
        {
            return -1;
        }
        else
        {
            top++;
            sarr[top]=data;
            return 1;
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            return -1;
        }
        else
        {
            int temp=sarr[top];
            top--;
            return temp;
        }
    }
    public int peek()
    {
        return sarr[top];
    }
    public void sdisplay()
    {
        System.out.print("Stack contains : ");
        for(int i=top;i>=0;i--)
        {
            System.out.print(sarr[i]+" ");
        }
        System.out.println();
    }

    public int enqueue(int data)
    {
        if(rear==sizeq-1)
        {
            return -1;
        }
        else if(front==-1 && rear==-1)
        {
            front=0;
            rear++;
            qarr[rear]=data;
            return 1;
        }
        else
        {
            rear++;
            qarr[rear]=data;
            return 1;
        }
        
    }
    public int dequeue()
    {
        if(front>rear)
        {
            front=-1;
            rear=-1;
            return -1;
        }
        else
        {
            
            if(rear==-1)
            {
                return -1;
            }
            else
            {
                int temp=qarr[front];
                for(int i=0;i<rear;i++)
                {
                    qarr[i]=qarr[i+1];
                }
                qarr[rear]=0;
                rear--;
                return temp;
            }
        }
    }
    public void qdisplay()
    {
        System.out.print("Queue Contains : ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(qarr[i]+" ");
        }
        System.out.println();
    }
}

class StackQueueTest
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of stack :");
        int sizes=sc.nextInt();
        System.out.print("Enter size of Queue :");
        int sizeq=sc.nextInt();
        StackQueue sq=new StackQueue(sizes, sizeq);
        while(true)
        {
            System.out.print("1.Push\t\t2.Pop\t\t3.Peek\t\t4.Display Stack\t\t5.Enqueue\t6.Dequeue\t7.Display Queue\t8.Exit\nEnter Choice : ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                        System.out.println("Enter data to insert in stack : ");
                        int data=sc.nextInt();
                        int a=sq.push(data);
                        if(a==-1)
                        {
                            System.out.println("Stack Overflow");
                        }
                        else
                        {
                            System.out.println("Data entered succesfully");
                        }  
                        break;
                case 2:
                        int b=sq.pop();
                        if(b==-1)
                        {
                            System.out.println("Stack Underflow");
                        }
                        else
                        {
                            System.out.println(b+" is popped");
                        }
                        break;
                case 3:
                        int c=sq.peek();
                        System.out.println("peek element = "+c);
                        break;
                case 4:
                        sq.sdisplay();
                        break;
                case 5:
                        System.out.print("Enter element to insert in Queue : ");
                        int data1=sc.nextInt();
                        int d=sq.enqueue(data1);
                        if(d==-1)
                        {
                            System.out.println("Queue is full");
                        }
                        else
                        {
                            System.out.println("Element entered Successfully");
                        }
                        break;
                case 6:
                        int e=sq.dequeue();
                        if(e==-1)
                        {
                            System.out.println("Queue is Empty");
                        }
                        else
                        {
                            System.out.println("Dequeued element = "+e);
                        }
                        break;
                case 7:
                        sq.qdisplay();
                        break; 
                case 8:
                        System.exit(0);
             }
        }
    }
}