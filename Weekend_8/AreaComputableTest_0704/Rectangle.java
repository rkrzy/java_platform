package Weekend_8.AreaComputableTest_0704;

public class Rectangle implements MyComparable, AreaComputable{
    private int height;
    private int width;
    public Rectangle(int width,int height)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equal(Object other) {
        if(!(other instanceof Rectangle)) return false;
        Rectangle re = (Rectangle) other;
        return (re.width == width)&&(re.height == height);
    }

    @Override
    public int compareTo(Object other) {
        if(!(other instanceof Rectangle)) return -2;
        Rectangle re = (Rectangle) other;
        if(this.getArea()<re.getArea())return -1;
        else if(this.getArea()==re.getArea())return 0;
        else return 1;
    }

    @Override
    public float getArea() {
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{Width: %5d, Height: %5d}",this.width,this.height);
    }
}
