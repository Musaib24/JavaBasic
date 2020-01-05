package OOP;

public class Student {
    int age;
    String name;
    String address;

    public Student(String name, int age, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }


    public String toString(Student s) {
        return "Name: " + s.name + "Age: " + s.age + "Address : " + s.address;
    }
}
