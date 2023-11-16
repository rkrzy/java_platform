package Weekend_2;

import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        if(num1%2 ==0&&num1%3==0)
        {
            System.out.printf("%d is a multiple of 2 and 3",num1);
        }
        else if(num1%2 == 0)
        {
            System.out.printf("%d is a multiple of 2",num1);
        }
        else if(num1%3 ==0)
        {
            System.out.printf("%d is a multiple of 3",num1);
        }
        else {
            System.out.printf("%d is not a multiple of 2 and 3",num1);
        }
    }
}
