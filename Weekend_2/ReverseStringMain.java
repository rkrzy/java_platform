package Weekend_2;

import java.util.Scanner;

public class ReverseStringMain {
    static public void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[]my_arr = str.toCharArray();
        char[]my_arr2 = new char[my_arr.length];
        int num = my_arr.length-1;
        for(int i =0;i<=num;i++)
        {
            my_arr2[i] = my_arr[num-i];
        }
        System.out.println(new String(my_arr2));
    }
}
