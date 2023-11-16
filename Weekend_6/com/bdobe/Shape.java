package Weekend_6.com.bdobe;

public abstract class Shape {
    private int lineColor;
    Shape()
    {
        lineColor = 2;
    }
    public int getLineColor()
    {
        return lineColor;
    }
    public void setLineColor(int color)
    {
        lineColor = color;
    }
    public abstract float getLength();
    public abstract void draw();
    public abstract float getArea();
}
