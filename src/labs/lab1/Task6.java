package labs.lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar calendar = new GregorianCalendar();

        String name = sc.next();
        int year = sc.nextInt();

        System.out.println(name + " " + (calendar.get(Calendar.YEAR) - year) + " years");
    }
}
