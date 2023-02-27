package labs.lab1;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        int year = sc.nextInt();

        System.out.println(Math.abs(calendar.get(Calendar.YEAR) - year));

    }
}
