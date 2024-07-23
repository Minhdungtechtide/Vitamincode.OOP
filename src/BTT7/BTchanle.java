package BTT7;

import java.util.Arrays;

public class BTchanle {
    public static void main(String[] args) {
        int[] Array = {5, 2, 3, 1, 4, 9};
        // Em sắp xếp lại cho giống kết quả ( Dùng Double short )
//        for (int i = 0; i < Array.length - 1; i++) {
//            for (int j = 0; j < Array.length - i - 1; j++) {
//                if (Array[j] > Array[j + 1]) {
//                    int temp = Array[j];
//                    Array[j] = Array[j + 1];
//                    Array[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(Array); // Sắp xếp từ nhỏ đến lớn
        System.out.println("Mảng sau khi sắp xếp : "+ Arrays.toString(Array));
//        for (int i = 0; i < Array.length; i++) {
//            System.out.print(Array[i] + " ");
//        }

        System.out.println("\nSố chẵn trong mảng:");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                System.out.print(Array[i] + " ");
            }
        }

        System.out.println("\nSố lẻ trong mảng:");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 != 0) {
                System.out.print(Array[i] + " ");
            }
        }
    }
}


