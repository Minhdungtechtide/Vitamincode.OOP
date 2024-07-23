package Chapper4;

public class Sinhvien {
    public static String schoolname = "FPT";
    private String fullname;
    private int age;
    private String major;

    public Sinhvien() {}
    public Sinhvien(String fullName, int age, String major) {
        this.fullname = fullName;
        this.age = age;
        this.major = major;    }

    public static String getSchoolname() {
        return schoolname;
    }

    public static void setSchoolname(String schoolname) {
        Sinhvien.schoolname = schoolname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
