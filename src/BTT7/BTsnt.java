package BTT7;

import java.util.Arrays;

public class BTsnt {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 4, 9};

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.print("Số nguyên tố trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            if (SNT(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Số chính phương trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            if (SCP(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static boolean SNT(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean SCP(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
}

