package p1;
public class Trig
{
    double rad;
    public Trig(int deg)
    {
        rad=Math.toRadians(deg);
    }
    public double sine()
    {
        return Math.sin(rad);
    }
    public double cosine()
    {
        return Math.cos(rad);
    }
    public double tang()
    {
        return Math.tan(rad);
    }
    public double cosec()
    {
        return (1/Math.sin(rad));
    }
    public double sec()
    {
        return (1/Math.cos(rad));
    }
    public double cot()
    {
        return (1/Math.tan(rad));
    }
}