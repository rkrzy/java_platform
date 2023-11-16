package Weekend_7.Local_inner_class;


import java.util.Scanner;

public class LocalInnerClassTest {

    public static void main(String[] args) {

        new LocalInnerClassTest().run();

    }



    private void run() {

        class Time {

            // your code here
            int hour;
            int minute;
            int second;



            public Time(int hour, int minute, int second) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }



            @Override

            public String toString() {

                return "Time["+hour+":"+minute+":"+second+"]";

            }

        }

        Scanner sc = new Scanner(System.in);

        Time time1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        Time time2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();

        System.out.println(time1);

        System.out.println(time2);

    }

}