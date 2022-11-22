package p1;
public class Arithmatic
{
    int x,y;
    public Arithmatic(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int sum()
    {
        return x+y;
    }
    public int sub()
    {
        return x-y;
    }
    public int multi()
    {
        return x*y;
    }
    public float div()
    {
        float z=y;
        return x/z;
    }
}