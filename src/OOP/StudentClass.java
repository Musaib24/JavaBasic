package OOP;


public class StudentClass {

    public StudentClass(String name, int age, String address) {

    }

    public static void main(String[] args) {
        StudentClass[] ss = new StudentClass[5];

        StudentClass Student1 = new StudentClass("Andy", 18, "123 Main Sreet ");
        ss[1] = new StudentClass("Lisa", 20, "123 New York");
        ss[2] = new StudentClass("Bob", 10, "123 falls church");
        ss[3] = new StudentClass("Eva", 18, "123 Flushing");
        ss[4] = new StudentClass("Tim", 13, "123 Fishers ");


//        for (int i = 0; i < ss.length; i++);

    }


    }