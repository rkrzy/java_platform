package weekend_1;

import java.util.Scanner;
public class TypeMain {
    public static void main(String[] args) {
        /* Your code here!*/
        // 스캐너로 입력 받기
        // printType() 호출
        // 형변환 ( String --> int)
        // 형변환 ( String --> float)
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printType(str);
        System.out.println("Type conversion to int...");
        printType(Integer.parseInt(str));
        System.out.println("Type conversion int to float...");
        printType(Float.parseFloat(str));




        scanner.close();
    }
    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {
        System.out.println(x + " is a float");
    }
}