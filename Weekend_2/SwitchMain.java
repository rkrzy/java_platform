package Weekend_2;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchMain {

   public enum Month {January, February, March, April, May, June, July, August, September, October, November, December;


        public Month add(int num)
        {
            return Month.January;
        }
    }
    public static Month[] Mon = Month.values();
    public static Month Mon_add(int num)
    {
            return Mon[num-1];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Month> Arr = new ArrayList<Month>();
        boolean can = true;
        while (can) {
            String str1 = scanner.next();

            switch (str1) {
                case "add":
                    String str2 = scanner.next();
                    Arr.add(Mon_add(Integer.parseInt(str2)));
                    break;
                case "print":
                    System.out.printf("[");
                    int j =1;
                    for (Month i : Arr) {
                        System.out.printf(i.name());
                        if(j != Arr.size())
                        System.out.printf(", ");
                        j++;
                    }
                    System.out.printf("]");
                    System.out.println();
                    break;
                case "quit":
                    System.out.println("Bye");
                    can = false;
                    break;
                default:
                    System.out.println("Invalid Command");
                    scanner.nextLine();
                    break;
            }

        }
    }
}
