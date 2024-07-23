package BTT7;

public class BT3 {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 4, 9};
        int min = array[0];
        int max = array[0];
        int secondMax = Integer.MIN_VALUE;
                for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    secondMax = max;
                    max = array[i];
                }else if (array[i] > secondMax && array[i] < max) {
                    secondMax = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
                System.out.println("Giá trị nhỏ nhất (MIN): " + min);
                System.out.println("Giá trị lớn nhất (MAX): " + max);
                System.out.println("Phần tử lớn thứ hai: " + secondMax);
    }
}
