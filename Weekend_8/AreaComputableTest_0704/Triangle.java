package Weekend_8.AreaComputableTest_0704;

public class Triangle implements AreaComputable {
    private int width, height ;
    public Triangle(int width, int height) {
        this.width = width ; this.height = height ; }
    public float getArea() { return (float) 0.5 * width * height ; }
    public String toString() {
        return String.format("Width: %5d, Height: %5d", width, height) ; }
}