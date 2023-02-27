package labs.lab1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Scanner sc = new Scanner(System.in);

        System.out.println(calendar.get(Calendar.YEAR) - sc.nextInt());
    }
}
