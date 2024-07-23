package Chapter8;

public class Video51 {
    public static void main(String[] args){
        System.out.println("Run ");
        Students st1 = new Students("123","Minh dũng",21,9);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);

        Person p1 = new Person("123","Minh Dũng",26);
        System.out.println(p1);
    }
}
