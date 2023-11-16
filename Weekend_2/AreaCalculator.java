package Weekend_2;

import java.util.Scanner;


public class AreaCalculator {


    public enum Shape{TRIANGLE,RECTANGLE, CIRCLE,QUIT,NOT;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1;
        float num2;
        boolean flag = true;

        while (flag) {
            String str1 = scanner.next().toUpperCase();
            Shape Sh = Shape.RECTANGLE;
            if(str1.equals(Shape.TRIANGLE.name())||str1.equals(Shape.CIRCLE.name())||str1.equals(Shape.RECTANGLE.name())
            ||str1.equals(Shape.QUIT.name()))
            {
                Sh = Shape.valueOf(str1.toUpperCase());
            }
            else {
                Sh = Shape.NOT;
            }
            switch (Sh)
            {
                case TRIANGLE:
                     num1 = scanner.nextFloat();
                     num2 = scanner.nextFloat();
                    System.out.printf("Area of Triangle: %.2f\n",num1*num2/2);
                    break;
                case RECTANGLE:
                     num1 = scanner.nextFloat();
                     num2 = scanner.nextFloat();
                    System.out.printf("Area of Rectangle: %.2f\n",num1*num2);
                    break;
                case CIRCLE:
                     num1 = scanner.nextInt();
                    System.out.printf("Area of Circle: %.2f\n",num1*Math.PI*num1);
                    break;
                case QUIT:
                    System.out.println("Bye");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
            scanner.nextLine();



        }
        scanner.close();
    }
}
