package p1;
public class Stat
{
    int[] arr;
    int size;
    public Stat(int size)
    {
        this.size=size;
        arr=new int [this.size];
    }
    public void setdata(int data,int i)
    {
        arr[i]=data;     
    }
    public float sum()
    {
        float sum=0;
        for(int i=0;i<this.size;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public int count()
    {
        int count=0;
        for(int i=0;i<this.size;i++)
        {
            count++;
        }
        return count;
    }
    public int min()
    {
        int min=arr[0];
        for(int i=0;i<this.size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public int max()
    {
        int max=arr[0];
        for(int i=0;i<this.size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public float avg()
    {
        return sum()/count();
    }
}