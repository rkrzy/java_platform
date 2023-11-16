package Weekend_8.Circle_sort_Test_0702;

public class Rectangle implements MyComparable{
    int width;
    int height;
    public Rectangle(int width,int height)
    {
        this.height = height;
        this.width = width;
    }    @Override
    public int compareTo(Object other) {
        if(!(other instanceof Rectangle))return -2;
        Rectangle Rec = (Rectangle) other;
        int size1 = this.height*this.width;
        int size2 = Rec.height* Rec.width;
        int return_Value = 0;
        if(size1<size2) return return_Value = -1;
        else if(size1==size2) return_Value = 0;
        else if(size1>size2) return_Value =1;
        return return_Value;
    }

    @Override
    public boolean equal(Object other) {
        if(!(other instanceof Weekend_8.CircleTest_0701.Rectangle))
        {
            return false;
        }
        Weekend_8.CircleTest_0701.Rectangle Rec = (Weekend_8.CircleTest_0701.Rectangle) other;
        return (this.width == ((Rectangle) other).width)&&(this.height==(((Rectangle) other).height));}

    @Override
    public String toString()
    {
        return String.format("Rectangle{area=%d}",height*width);
    }

}
