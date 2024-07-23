package Chapper6;

public class Cha {
    public static void main(String[] args){
        System.out.println("Run");
        Sinhvien it1 = new SinhvienIT(10,6);
        System.out.println("Sinh viên IT Score = " + it1.getScore());

        Sinhvien Cokhi1 = new Sinhviencokhi(10,9);
        System.out.println("Sinh vieen Cơ khí Score = " + Cokhi1.getScore());
    }
}
