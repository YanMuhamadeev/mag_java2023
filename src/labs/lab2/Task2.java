package labs.lab2;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        sneak(array);
    }

    static void sneak(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i % 2 == 0 && i != array.length - 1) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == array[i].length - 1) {
                        System.out.print("v");
                    } else {
                        System.out.print("=");
                    }
                }
                System.out.println("");
            } else if (i % 2 != 0 && i != array.length - 1) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0) {
                        System.out.print("v");
                    } else {
                        System.out.print("=");
                    }
                }

                System.out.println("");

            } else if (i == array.length - 1 && i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == array[i].length - 1) {
                        System.out.print(">");
                    } else {
                        System.out.print("=");
                    }
                }
                System.out.println("");
            } else if (i == array.length - 1 && i % 2 != 0) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0) {
                        System.out.print("<");
                    } else {
                        System.out.print("=");
                    }
                }
                System.out.println("");
            }
        }
    }
}
