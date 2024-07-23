//import java.util.Scanner;
//
//public class Bai1 {
//    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("First number :" + Math.pow(6,2));
//        int FirstNumber = scanner.nextInt();
//
//        System.out.println("Second number ;" + Math.pow(7,4));
//        int SecondNumber = scanner.nextInt();
//
//        System.out.println("Min = : " + Math.min(FirstNumber,SecondNumber));
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your name is :");
//        String name  = scanner.nextLine();
//        System.out.println("Your age is ;");
//        int age = scanner.nextInt();
//        System.out.println("My name is : " + name + "age : " + age);
//        scanner.close();

//        int age = 21;
//        String name = " Dung ";
//        System.out.println("My age is : " + age + ",Name is: " + name);

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập tên : ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập điểm : ");
//        int score = scanner.nextInt();
//
//        System.out.println(name + " Có điểm = " + score);
//        scanner.close();

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào chiều dài hình chữ nhật : ");
//        int CD = scanner.nextInt();
//
//        System.out.println("Nhập vào chiều rộng hình chữ nhật : ");
//        int CR = scanner.nextInt();
//
//        int Chuvi = (CD + CR)*2;
//        int Dientich = CD * CR;
//        int Canhmin = Math.min(CD,CR);
//
//        System.out.println("Chu vi =  : " + Chuvi);
//        System.out.println("Diện tích =  : " + Dientich);
//        System.out.println("Cạnh Min =  : " + Canhmin);
//        scanner.close();

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào cạnh hình lập phương : ");
//        int canh = scanner.nextInt();
//        double thetich = Math.pow(canh,3);
//        System.out.println("Thể tích = : " + thetich);
//        scanner.close();

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        int score = 10;
//        if (score > 5) {
//            System.out.println("Đủ điểm qua môn ");
//        }else{
//            System.out.println("Rớt");
//        }

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào tax = ");
//        int tax = scanner.nextInt();
//        if (tax < 10) {
//            System.out.println("Không đóng thuế ");
//        } else if (10 <= tax && tax <= 15) {
//            System.out.println("Thuế 10% ");
//        } else if (15 <= tax && tax <= 30) {
//            System.out.println("Thuế 20% ");
//        }else {
//            System.out.println("Thuế 50% ");
//        }
//        scanner.close();

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào day = ");
//        int day = scanner.nextInt();
//        switch (day) {
//            case 1 :
//                System.out.println("Monday ");
//                break;
//            case 2 :
//                System.out.println("Tuesday ");
//                break;
//            case 3 :
//                System.out.println("Wednesday ");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday ");
//                break;
//            case 6 :
//                System.out.println(" Saturday ");
//                break;
//            case 7 :
//                System.out.println("Sunday ");
//                break;
//            default :
//                System.out.println("Don't know ");
//        }

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

//        System.out.println(">> Lựa chọn của bạn là <<");
//        System.out.println(">> 1. Cộng <<");
//        System.out.println(">> 2. Trừ <<");
//        System.out.println(">> 3. Kết thúc <<");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lựa chọn của bàn là  ");
//        int value = scanner.nextInt();
//
//        switch (value) {
//            case 1:
//                System.out.println("Bạn lựa chọn phép cộng ");
//                break;
//            case 2:
//                System.out.println("Bạn lựa chọn phép trừ ");
//                break;
//            default:
//                System.out.println("Bạn lựa chọn phép Kết thúc ");
//                System.exit(0);
//        }

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
        // Giải 1 Pt bậc nhất
//        int a = 3;
//        int b = 11;
//        System.out.printf(" Giải PT bậc nhất %dx + %d = 0 \n ", a , b);
//
//        if( a == 0 && b == 0 ) {
//            System.out.println("Phương trình có vô số nghiệm ");
//        }else if ( a == 0 && b != 0){
//            System.out.println("Phương trình vô nghiệm ");
//        }else {
//           float x = (float) -b/a;
//            System.out.println("Phương trình có nghiệm x =  " + x);
//        }

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

        // Giờ là nhập pt bậc một
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhâp vào biến a = ");
//        int a = scanner.nextInt();
//        System.out.print("Nhâp vào biến b = ");
//        int b = scanner.nextInt();
//        System.out.printf(" Giải PT bậc nhất %dx + %d = 0 \n ", a , b);
//
//        if( a == 0 && b == 0 ) {
//            System.out.println("Phương trình có vô số nghiệm ");
//        }else if ( a == 0 && b != 0){
//            System.out.println("Phương trình vô nghiệm ");
//        }else {
//            float x = (float) -b/a;
//            System.out.println("Phương trình có nghiệm x =  " + x);
//        }

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
//          Bảng cửu chương

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số nguyên bất kỳ ");
//        int x= scanner.nextInt();
//        for(int i=1 ; i <=10; i++){
//            System.out.printf(" %d x %d = %d",x,i,x*i);
//            System.out.printf(" \n ");
//        }
//        scanner.close();
//        }
//    }

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
//          Array
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Bai1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử của Array: ");
//        int size = scanner.nextInt();
//        int[] a = new int[size];
//        System.out.println("Nhập phần tử : ");
//        for (int i = 0; i < size; i++) {
//            a[i] = scanner.nextInt();
//        }
//        System.out.println("Array ban đầu " + Arrays.toString(a));
//        // Cách 1:
////        Arrays.sort(a); // Sắp xếp từ nhỏ đến lớn
////        System.out.println("Array sắp xếp : "+ Arrays.toString(a));
////        System.out.println(" max = " + a[a.length - 1 ]);
////        System.out.println(" min = " + a[0]);
//        int max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            max = Math.max(max, a[i]);
//        }
//        int min = a[0];
//        for (int i = 0; i < a.length; i++) {
//            min = Math.min(min, a[i]);
//        }
//        System.out.println("max = " + max);
//        System.out.println("Min = " + min);
//    }
//}

//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
////              Số nguyên tố

//import java.util.Scanner;
//public class Bai1 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào 1 số nguyên bất kỳ ");
//        int value = scanner.nextInt();
//        int count=0;
//        for(int i =2;i<=value-1;i++){
//            if(value % i==0){
//                System.out.println("Ước số khác : "+i);
//                count++;
//                break;
//            }
//        }
//        if(count==0){
//            System.out.printf("%d là số nguyên tố",value);
//        }else {
//            System.out.printf("%d là số Không là số nguyên tố ",value);
//        }
//    }
//}
//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
//       bài tập generic
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Baitapgeneric {
//
//        public static void maiṇ(String[] args){
//            Scanner scanner = new Scanner(System.in);
//            Arraylist<Double> arrNumber = new Arraylist<>();
//            while(true){
//                System.out.println(" Nhập vào 1 số bất kỳ : ");
//                double input = scanner.nextDouble();
//                arrNumber.add(input);
//                scanner.nextLine(); // =enter
//
//                System.out.println("Continue ? Y or N ??? ");
//                String option = scanner.nextLine();
//                if (option.equals("N") || option.equals("n")){
//                    break;
//                }
//            }
//        System.out.println("check array");
//        }
//    }
//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
// Cũng liên quan về array

//import java.util.ArrayList;
//public class Bai1 {
//    // Đối với arraylist sẽ làm việc với kiểu dữ liệu không nguyên thủy
//    public class Arrayy {
//        public <Student> void main(String[] args) {
//            int a = 10;
//            // Còn đây là code hay code bth ArrayList a2 = newArraylist();
//            ArrayList<String> a1 = new ArrayList<String>(); // Ép kiểu ( có thể nói generic )
//            ArrayList<Student> a3 = new ArrayList<Student>(); // Cũng là generic
//            a1.add("Hoi bai");
//            a1.add("Minh Dũng");
//            a1.remove(1);
//            System.out.println(a1.toString() + " " + a1.get(1));
//        }
//    }
//}
//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
//      Giải PT bậc 2

//import java.util.Scanner;
//
//public class Bai1 {
//    public static void Giaichuongtrinhbacnhat(int a, int b) {
//        System.out.printf(" Giải PT bậc nhất %dx + %d = 0 \n ", a, b);
//        if (a == 0 && b == 0) {
//            System.out.println("Phương trình có vô số nghiệm ");
//        } else if (a == 0 && b != 0) {
//            System.out.println("Phương trình vô nghiệm ");
//        } else {
//            float x = (float) -b / a;
//            System.out.println("Phương trình có nghiệm x =  " + x);
//        }
//    }
//
//    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Nhâp vào biến a = ");
//            int a = scanner.nextInt();
//            System.out.print("Nhâp vào biến b = ");
//            int b = scanner.nextInt();
//            System.out.print("Nhâp vào biến c = ");
//            int c = scanner.nextInt();
//            System.out.printf(" Giải PT bậc hai %dx^2 + %dx + %d = 0 \n ", a, b, c);
//
//            if (a == 0) {
//                // Viết logic giải chương trình bậc nhất ( Gọi hàm ở trên)
//                Giaichuongtrinhbacnhat(b, c);
//            } else {
//                int delta = b * b - 4 * a * c;
//                if (delta < 0) {
//                    System.out.println("Phương trình vô nghiệm ");
//                } else if (delta == 0) {
//                    float x = (float) -b / (2 * a);
//                    System.out.printf("Phương trình có nghiệm kép x = %f  ", x);
//                } else {
//                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
//                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
//                    System.out.printf("Phương trình có 2 nghiệm riêng biệt x1 = %f , x2 = %f ", x1, x2);
//                }
//            }
//            scanner.close();
//        }
//    }
