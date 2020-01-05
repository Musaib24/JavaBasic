package OOP;

public class Constractor {
    int modelYear;
    String modelName;

    public Constractor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constractor myCar = new Constractor(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

