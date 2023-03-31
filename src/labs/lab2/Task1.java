package labs.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Arrays size");
        int[] array = new int[sc.nextInt()];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        Arrays.sort(array);

        for(int elem : array) {
            System.out.print(elem + " ");
        }

        showElem(array);
    }

    static void showElem(int[] array) {
        ArrayList<Integer> min = new ArrayList<>(Arrays.asList(array[0]));
        ArrayList<Integer> index = new ArrayList<>(Arrays.asList(0));

        if(array.length == 1) {
            System.out.println("\nElem: "+ min + "\nIndex: " + index);
        }

        for (int i = 1; i < array.length; i++) {
            if(min.get(0) >array[i]) {

                min.clear();
                index.clear();
                min.add(array[i]);
                index.add(i);

            } else if (min.get(0) == array[i]) {

                min.add(array[i]);
                index.add(array[i]);

            }
        }

        System.out.println("\nElem: "+ min + "\nIndex: " + index);
    }
}
