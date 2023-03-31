package labs.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для шифромания");
        String text = sc.nextLine();

        System.out.println("Введите ключ");
        int i = sc.nextInt();

        String encryptString = getEncryptString(text,i);
        System.out.println(encryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        if(sc.next().equals("y")) {
            System.out.println(getDecryptString(text,i));
        } else if (sc.next().equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for(int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return "Текст после преобразования: " + encryptString;
    }

    public static String getDecryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for(int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return "Текст после преобразования: " + encryptString;
    }
}
