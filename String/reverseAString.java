package String;

import java.util.Scanner;

public class reverseAString {
    //      Problem : Reverse a String
    static void reverse(String str) {
        //Check string length
        int len = str.length();
        //Traverse the string last character  to first character
        for (int i = len-1; i >= 0; i--) {
            //Print Reverse String
            System.out.print(str.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        reverse(sc.nextLine());
    }
}
