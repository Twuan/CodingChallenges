/*
    Prints the number of integers in an array that are above the given input and 
    the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6, 
    print “above: 1, below: 4”.
*/
package codingchallenge1;

import java.util.Scanner;

public class CodingChallenge1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array: ");
        int numberOfElements = input.nextInt();
        
        int[] array = new int[numberOfElements];
        System.out.println("Enter the numbers of the array: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = input.nextInt();
        }
        
        System.out.println("Enter the \"asymptote\": ");
        int asymptote = input.nextInt();
        
        int above = 0, below = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < asymptote) {
                below++;
            }
            else if (array[i] > asymptote) {
                above++;
            }
        }
        
        System.out.println("above: " + above + ", below: " + below);
    }    
}
