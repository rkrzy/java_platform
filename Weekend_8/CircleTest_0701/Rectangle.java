package Weekend_8.CircleTest_0701;

public class Rectangle implements MyComparable{

    int width;
    int height;
    public Rectangle(int width,int height)
    {
        this.width = width;
        this.height =height;
    }
    @Override
    public int compareTo(Object other) {
        return 0;
    }

    @Override
    public boolean equal(Object other) {
        return false;
    }
    @Override
    public String toString()
    {
        return String.format("Rectangle{area=%d}",height*width);
    }

}
