package java_fundamentals;

public class StringExamples {
    public static void main(String[] args) {
        String s = "Welcome to selenium java training";
        System.out.println("Length: " + s.length());
        String upperCase = s.toUpperCase();
        System.out.println("Make " + s + " into UPPER case : " + upperCase);
        String lowerCase = s.toLowerCase();
        System.out.println("Make " + s + " into lower case : " + lowerCase);
        String[] welcome = s.split(" ");
        System.out.println("After split ");
        for (int i = 0; i <welcome.length; i++) {
            System.out.println(welcome[i]);
        }
        System.out.print(welcome.length);
        for (int j = welcome.length -1; j > 0; j-- ) {
        System.out.print(welcome[j]);
    }

    }
}
