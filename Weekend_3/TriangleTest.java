package Weekend_3;

import java.util.Scanner;

class Triangle{
    private final int base;
    private final int height;
    public Triangle(int base,int height)
    {
        this.base = base;
        this.height = height;
    }
    public Double getArea()
    {
        return (double)(base*height)/2;
    }
    public int get_base()
    {return this.base;}
    public int get_height()
    {return this.height;}
    @Override
    public String toString()
    {
        return String.format("Triangle [base=%d, height=%d, area=%.2f]\n",get_base(),get_height(),getArea());
    }
}

public class TriangleTest {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Triangle []triangles = new Triangle[num];
        for(int i =0;i<num;i++)
        {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            triangles[i] = new Triangle(num1,num2);
        }
        for(Triangle i : triangles)
        {
            System.out.println(i.toString());
        }
    }
}
