package java_fundamentals;

import java.util.Arrays;
public class JavaFirst {public static void main(String[] args) {

    // I want to create an integer array that can hold 5 numbers
    // a[] -> a is the name of the array
    int a[] = new int[5]; // creates place holder to store values

    // Fill in the array
    a[0] = 1; // At array index 0 store 1
    a[1] = 2;
    a[2] = 3;
    a[3] = 4;
    a[4] = 5;

    // Fill in array in different way ( optimized);
    int[] aTwo = {1, 2, 3, 4, 5};

    // Create array that contains different values
    String[] folksInCurrentClass = {"PJ", "Jishan", "Saera", "Sabrina", "java_fundamentals"};

    // Print 3rd value from array, index = 2
    System.out.println("Third value from array is : " + a[2]);

    // ******* Print all values of array *******
    for (int i = 0; i < folksInCurrentClass.length; i++) {
        System.out.println(folksInCurrentClass[i] + ", ");
    }

    System.out.println(" "); // Putting to print into separate lines -- you can ignore

    // ******* Convert array to string *******
    String[] words = {"I", "love", "JAVA"}; // array I want to convert

    String sentence = "";

    // Go over all words one by one
    for (int i = 0; i < words.length; i++) {
        // Add all words to sentence
        sentence = sentence.concat(words[i] + " ");
    }
    System.out.println("This is the full sentense: " + sentence);

    // Convert using build in method
    System.out.println("This is the full sentense using build in method: " + Arrays.toString(words));

    // HW folksInCurrentClass in a nice format such as this [PJ, Jishan, Saera,
    // Sabrina, Musaib]

    // How converted into nice sentence format from [I, love, JAVA] to I love JAVA

    // Muti dementional array
    /*
     * twoD array = [ [1, 2, 3], [4, 5, 6] ]
     */

    // How do you create it ?
    // How do I print specific index , example I want to print 5 from this line [4,
    // 5, 6]
    // Using 2d array print x and y coordinate from 2d array you will create
    /*
     * coordinates array = { {0,1}, {0,2}, {0,3}, {1,1}, {1,2}, {1,3}}
     *
     * Expected out to be like coordinates [0,1] , [0,2], [0,3], [1,1], [1,2], [1,3]
     *
     * Sample code
     */

    // arr[][]={{1,2,3},{2,4,5},{4,4,5}}; //printing 2D array
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
}
}
