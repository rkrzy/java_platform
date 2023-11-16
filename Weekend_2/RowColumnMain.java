package Weekend_2;

import java.util.Scanner;

public class RowColumnMain {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[][] Matrix = new int[num1][num2];

        int result = 1;
        for(int i =0;i<num1;i++)
        {
            for(int j = 0;j<num2;j++)
            {
                Matrix[i][j] = result;
                result++;
            }
        }
        System.out.println("Enter two numbers:");
        System.out.println();
        for(int i = 0;i<num1;i++)
        {
            int num3 = 1;
            for(int j : Matrix[i])
            {
                System.out.printf("%d",j);
                if(num3 != num2)
                {
                    System.out.print(", ");
                    num3++;
                }
            }
            num3 = 0;
            System.out.println();
        }

    }
}
