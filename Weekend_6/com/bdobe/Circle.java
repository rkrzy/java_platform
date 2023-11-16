package Weekend_6.com.bdobe;

public class Circle extends Shape {
    int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public float getLength() {
        return (float)(2*radius*Math.PI);
    }

    @Override
    public void draw() {
        System.out.printf("Circle,Area: %.2f,Length:%.2f\n",getArea(),getLength());
    }

    @Override
    public float getArea() {
        return (float)((float)(radius*radius)*Math.PI);
    }
}
