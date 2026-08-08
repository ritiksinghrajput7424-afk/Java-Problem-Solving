package String;

import java.util.Scanner;
 // Problem 1: Print Each Character
public class printEachCharacter {
    //Method for print each character of the given string
    static void printCh(String s) {
        //store the length of string
        int len = s.length();
        //Traverse the string from first character to last character
        for (int i = 0; i < len; i++) {
            //Get the character at index i and print it
            System.out.println(s.charAt(i));
        }
    }
    static void main(String[] args) {
        System.out.println("Please enter a string To print Each Character : ");
        Scanner sc=new Scanner(System.in);
        printCh(sc.nextLine());
    }
}
