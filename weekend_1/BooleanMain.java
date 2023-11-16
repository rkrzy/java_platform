package weekend_1;

import java.util.Scanner;
public class BooleanMain {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;
        num1 = scanner.next();
        num2 = scanner.next();

        System.out.println("Number1 : "+num1+", "+"Number2 : "+num2);
        System.out.println("Number1>Number2 ? " + (Integer.parseInt(num1)>Integer.parseInt(num2)));
        System.out.println("Number1<Number2 ? " + (Integer.parseInt(num1)<Integer.parseInt(num2)));
        System.out.println("Number1==Number2 ? " + num1.equals(num2));

    }
}
