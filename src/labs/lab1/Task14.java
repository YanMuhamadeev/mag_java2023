package labs.lab1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int number4 = number-1+number+number+1;

        System.out.println(number-1);
        System.out.println(number);
        System.out.println(number+1);
        System.out.println(Math.pow(number4,2));
    }
}
