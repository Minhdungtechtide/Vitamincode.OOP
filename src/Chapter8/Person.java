package Chapter8;

public class Person implements IPerson {
    protected String id;
    protected String name;
    protected int age;

    // In ra fuction sotring là giúp in ra đối tượng này và đọc được dữ liệu của nó


    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String id, String name, int age) {
        this.id = id; // trong interface không có hàm tạo nên không cần dùng super
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override // annotation === comment ( có nghĩa là cái hàm input sẽ ghi đè lại hàm overide ( cha )
    public void input() {

    }

    @Override
    public void display() {

    }
}
