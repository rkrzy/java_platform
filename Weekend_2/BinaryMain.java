package Weekend_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryMain {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int num1 = scanner.nextInt();
        System.out.printf("Number %d in Binary Number: ",num1);
        while(num1!=0)
        {
            result.add(0,num1%2);
            num1 = num1/2;
        }
        for(int num2 : result)
        {
            System.out.printf("%d",num2);
        }

    }
}
