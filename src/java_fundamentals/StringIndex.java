package java_fundamentals;

public class StringIndex {
    public static void main(String[] args)
    {
        String firstName = "Safwaan";
        String lastname = "Ahmed";
        System.out.println("Full Name = " + firstName + " " + lastname );
        // 1 Get the character at positions for first name and last name
        int index1 = firstName.charAt(0);
        int index2 = lastname.charAt(3);

        // 2 Print out the results.
        System.out.println("The character in firstName at position 0 is " +
                (char)index1);
        System.out.println("The character in lastname at position 3 is " +
                (char)index2);

        // 3 full name using concat methord
        String fullName = firstName.concat(lastname);
        System.out.println("Concat using concat() method :" + fullName);

        // 4 string contains the specified sequence of char values.
        boolean isitSafwaan = fullName.contains("Safwaan");
        System.out.println("Is this Safwaan ? " + isitSafwaan);

        //compare a given strings.
        System.out.println("Is firstName and lastName equal : " + firstName.equals(lastname));

        //ignoring case considerations
        String newFirstName = "SAFWAAN";
        System.out.println("With ignore case : " + firstName.equalsIgnoreCase(newFirstName));
        System.out.println("Withut ignore case : " + firstName.equals(newFirstName));

        // length of a given string
        String s = "Welcome to selenium java training";
        System.out.println("Length: " + s.length());

        //remove vowels from a string.
        String sentence = "software testing is a very painful course";
        System.out.println("Before replacement : " + sentence);
        String replaceString = sentence.replaceAll("[AEIOUaeiou]", ""); // softwere testing is e very peinful course
        System.out.println("After replacement : " + replaceString);


        String[] welcome = s.split(" ");

        System.out.println("After split ");
        for (int i = 0; i <welcome.length; i++){
            if (i % 2 == 0){
                welcome[i]= welcome[i].toLowerCase();
                System.out.print(welcome[i] + " ");
            }else {
                welcome[i] = welcome[i].toUpperCase();
                System.out.print(welcome[i] + " ");
            }

        }


    }
}
