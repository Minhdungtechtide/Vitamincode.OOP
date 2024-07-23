package Chapter8;

import java.util.Scanner;

public class Kiemthu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(" Nhập x = ");
            try {
                int x = scanner.nextInt();
                try {
                    System.out.println("kết quả 10/x = " + 10/x);
                    break;
                }catch (Exception e){
                    System.out.println(" Run x  = " + x );
                }
            }catch (Exception e) {
                scanner.next();
                System.out.println(" Run errol ");
            }
        }
    }
}
