package weekend_1;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String args[])
    {
        int j = 0;
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i =0;i<number;i++)
        {
            try
            {
                 String []str = new String[3];
                 str[0] = scanner.next();

                 while(scanner.hasNext())
                 {
                     j++;
                     str[j] = scanner.next();
                 }
                j = 0;
                 if(str[1] == "sqrt")
                 {
                     System.out.println(Math.sqrt(Integer.parseInt(str[1])));
                 }
                 else if(str[2] == "+")
                 {
                     System.out.println("Result: "+(Integer.parseInt(str[0])+Integer.parseInt(str[1])));
                 }
                 else if(str[2] == "-")
                 {
                     System.out.println("Result: "+(Integer.parseInt(str[0])-Integer.parseInt(str[1])));
                 }
                 else if(str[2] == "*")
                 {
                     System.out.println("Result: "+(Integer.parseInt(str[0])*Integer.parseInt(str[1])));
                 }
                 else if(str[2] == "/")
                 {
                     System.out.printf("Result: %.2f",(Integer.parseInt(str[0])/Integer.parseInt(str[1])));
                 }
                 else if(str[2] == "^")
                 {
                     System.out.println("Result: "+ Math.pow((Integer.parseInt(str[0])),Integer.parseInt(str[1])));
                 }
                 else {
                     System.out.println("Invalid operator");
                 }
            }
            catch(IllegalArgumentException I)
            {
                System.out.println("Invalid number format.");
            }
            catch(ArithmeticException a)
            {
                System.out.println("Division by zero.");
            }

        }
    }

}
