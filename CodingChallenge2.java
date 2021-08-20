/*
    Rotates the characters in a string by a given input and has the overflow 
    appear at the beginning, e.g. “MyString” rotated by 2 is “ngMyStri”.
*/

package codingchallenge2;

import java.util.Scanner;

public class CodingChallenge2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string (no spaces):  ");
        String string = input.next();
        
        System.out.println("Enter an integer for rotation less than length of string:  ");
        int rotation = input.nextInt();
        
        string = string.substring(string.length() - rotation) + string.substring(0, string.length() - rotation);
        
        System.out.println("Rotated string:  " + string);
    }    
}
