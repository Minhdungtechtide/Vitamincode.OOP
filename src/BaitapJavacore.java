//import java.util.Arrays;
//import java.util.Scanner;
//public class BaitapJavacore {
//    public static void main(String[] args) {
//public class BaitapJavacore {
//    public static void main(String[] args) {
//     1."Viết chương trình cho phép nhập:
//                . Họ và tên sinh viên,
//                . Tuổi
//    . Điểm trung bình
//        từ bàn phím sau đó xuất ra màn hình."

//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Nhập Họ và tên sinh viên : ");
//    String name = scanner.nextLine();
//
//    System.out.print("Nhập Tuổi : ");
//    int tuoi = scanner.nextInt();
//
//    System.out.print("Nhập Điểm trung bình : ");
//    Double diemtrungbinh = scanner.nextDouble();
//
//        System.out.println("Họ và tên: "+ name
//                         + "\nTuổi  " + tuoi
//                         + "\nĐiểm trung bình: " + diemtrungbinh);
//    scanner.close();
// }
//}
//    2.  "Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật.
//        Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật"

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập Chiều Dài của HCN : ");
//        int CD = scanner.nextInt();
//
//        System.out.println("Nhập Chiều rộng của HCN : ");
//        int CR = scanner.nextInt();
//
//        int Chuvi = (CD + CR)*2;
//        int Dientich = CD * CR;
//        int Canhmin = Math.min(CD,CR);
//        System.out.println("Chu vi =  : " + Chuvi);
//        System.out.println("Diện tích =  : " + Dientich);
//        System.out.println("Cạnh Min =  : " + Canhmin);
//        scanner.close();
// }
//}
//      3.":Viết Chương trình Cộng, Trừ Nhân Chia 2 số
//        Cho phép nhập 2 số nguyên và in ra kết quả màn hình"

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập A = : ");
//        int a = scanner.nextInt();
//
//        System.out.println("Nhập B = : ");
//        int b = scanner.nextInt();
//
//        int cong = a + b;
//        int tru = a - b;
//        int nhan = a * b;
//        double chia = 0;
//
//        if(b != 0 ) {
//            chia = (double) a/b;
//        }
//        System.out.println("Phép cộng =  : " + cong);
//        System.out.println("Phép trừ =  : " + tru);
//        System.out.println("Phép nhân =  : " + nhan);
//        System.out.println("Phép chia =  : " + chia);
//        scanner.close();

//        System.out.println(">> Lựa chọn của bạn là <<");
//        System.out.println(">> 1. Cộng <<");
//        System.out.println(">> 2. Trừ <<");
//        System.out.println(">> 3. Nhân <<");
//        System.out.println(">> 4. Chia <<");
//        System.out.println(">> 5. Kết thúc <<");
//        System.out.println("Lựa chọn của bạn là  ");
//        int value = scanner.nextInt();
//
//        switch (value) {
//            case 1:
//                System.out.println("Bạn lựa chọn phép cộng ");
//                break;
//            case 2:
//                System.out.println("Bạn lựa chọn phép trừ ");
//                break;
//            case 3:
//                System.out.println("Bạn lựa chọn phép nhân ");
//                break;
//            case 4:
//                System.out.println("Bạn lựa chọn phép chia ");
//                break;
//            default:
//                System.out.println("Bạn lựa chọn phép Kết thúc ");
//                System.exit(0);
//        }
//     }
//}
//   4.   Viết chương trình tính lãi xuất gửi ngân hàng.
//                Lãi xuất = (P × R × T)/100
//        Trong đó:
//        P là số tiền gốc
//        R là lãi xuất mỗi năm (8%)
//        T là thời gian (tính bằng năm)
//        Cho phép người dùng nhập và in ra Lãi Xuất

//        Scanner scanner = new Scanner(System.in);
//        double p=0;
//        do {
//            System.out.println("Nhập P = : ");
//                p = scanner.nextDouble();
//        }while(p<=0);
//
//        double r = 8.0;
//
//        System.out.println("Nhập T = : ");
//        Double t = scanner.nextDouble();
//
//        Double laisuat = (p*r*t)/100;
//
//        System.out.println("Lãi suất là: " + laisuat);
//        scanner.close(); // Tại sao phải đóng => scanner được quản lỷ bới hệ thống java . Khi sử dụng đối tượng của hệ thống được , khi không sử dụng hệ thống thì phải đóng
// }
//}
//    5.  ": Kiểm tra số chẵn hay số lẻ
// Nhập vào bàn phím 1 số nguyên dương, in ra kết quả số mầ người dùng nhập là chẵn hay lẻ""

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào một số nguyên dương: ");
//
//        int number = scanner.nextInt();
//
//        if (number > 0) {
//            if (number % 2 == 0) {
//                System.out.println("Số " + number + " là số chẵn.");
//            } else {
//                System.out.println("Số " + number + " là số lẻ.");
//            }
//        } else {
//            System.out.println("Vui lòng nhập một số nguyên dương.");
//        }
//
//        scanner.close();
// }
//}
        //Cách 2:
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào một số nguyên dương: ");
//
//        int number = scanner.nextInt();
//        if (number > 0) {
//            String kq = ("Số " + number + " là số lẻ.");
//            if (number % 2 == 0) {
//                kq = ("Số " + number + " là số chẵn.");
//            }
//            System.out.println(kq);
//        }
// }
//}
        //cách 3:
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào một số nguyên dương: ");
//
//        Integer number = scanner.nextInt();
//        System.out.println(number instanceof Integer);
//        if (number > 0) {
//            String kq = ("Số " + number + " là số lẻ.");
//            if (number % 2 == 0) {
//                kq = ("Số " + number + " là số chẵn.");
//            }
//            System.out.println(kq);
//        }
// }
//}
//      1. "Tìm phần tử có giá trị nhỏ nhất(MIN) & cao nhất(MAX) trong mảng.
//        Cho 1 mảng Gồm các phần tử sau: [12, 31, 45, 67, 94, 234, -142, 564, 1, 567]
//        Sử dụng vòng lặp và so sánh các giá trị trong mảng và xuất giá màn hình.

//public class BaitapJavacore {
//    public static void main(String[] args) {
//int[] array = {12, 31, 45, 67, 94, 234, -142, 564, 1, 567};
//
//int min = array[0];
//int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//        if (array[i] < min) {
//min = array[i];
//        }
//        if (array[i] > max) {
//max = array[i];
//        }
//        }
//
//
//        System.out.println("Giá trị nhỏ nhất (MIN): " + min);
//        System.out.println("Giá trị lớn nhất (MAX): " + max);

//       2."In ra màn hình bảng cửu chương
//        Sử dụng vòng lặp for in ra màng hình bảng cửu chương từ 2 đến 9
//        (Gợi ý sử dung 2 vòng lặp)

//public class BaitapJavacore {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 9; i++) {
//            System.out.println("Bảng cửu chương từ 2 đến 9 : " + i + ":");
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }


//       3."Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//        In ra tất cả số nguyên tố trong khoảng từ 0 - n



//      4.": Nhập Số Nguyên n và m từ bàn phím
//        Điều Kiện: m lớn hơn n 5 đơn vị (Không thõa ==> nhập lại đến khi được thì thôi)
//        Tìm số chẵn đầu tiên trong n và m

//    int n=0;
//    int m=0;
//    Scanner sc = new scanner(System.in);

//      5. "Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//                - Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
//        - Xuất ra màn hình theo cú pháp [ <ký tự tìm thấy> ; <vị trí trong chuỗi


//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
//          Bài sắp xếp gì đó
//import java.util.Arrays;
//public class BaitapJavacore {
//    public static void main(String[] args) {
//        int [] clubs = {5,6,3,2,62};
//        for(int i =0;i < clubs.length -1 ;i++){
//            for(int j =i+1;j < clubs.length  ;j++){
//                if (clubs[i]>clubs[j]){ // Có thể đổi sắp xếp tăng , giảm tùy ý
//                    int temp = clubs[i];
//                    clubs[i]=clubs[j];
//                    clubs[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(clubs));
//    }
//}

