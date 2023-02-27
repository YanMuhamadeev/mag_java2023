package labs.lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.next();
        int days = sc.nextInt();

        getAnswer(month,days);


    }


    static void getAnswer(String month, int days) {
        if(month.equals("February") && days <= 29 ) {

            System.out.println("Yes \n if((year % 400 == 0) ||" +
                    "(year %4 == 0 && year % 100 != 0)) = 29 days \n else 28 days");

        } else if(month.equals("January") ||
                month.equals("March") ||
                month.equals("May") ||
                month.equals("July") ||
                month.equals("August") ||
                month.equals("October") ||
                month.equals("December") &&
                days <=31) {

            System.out.println("Yes");

        } else if(month.equals("April") ||
                month.equals("June") ||
                month.equals("September") ||
                month.equals("November") &&
                days <=30) {

            System.out.println("Yes");

        } else {
            System.out.println("No or wrong month");
        }

    }
}
