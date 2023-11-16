package weekend_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMain {
    public static void main(String[] args) {
        //입력으로부터 배열을 생성하시오

        //shallow copy 수행 코드를 작성하시오
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[]original = new int[num];
        for(int i =0;i<num;i++)
        {
            original[i] = scanner.nextInt();
        }
        int[]shallow = original;
        int[]deep = new int[num];
        System.arraycopy(original,0,deep,0,original.length);
        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(original));

        //deep copy 수행 코드를 작성하시오
        modifyArray(deep, 2);
        System.out.println("Deep Copy: " + Arrays.toString(original));
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}
