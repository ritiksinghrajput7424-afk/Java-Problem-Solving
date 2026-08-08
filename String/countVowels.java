package String;

import java.util.Scanner;

public class countVowels {
    //      Problem 2: Count Vowels
    static int countVowels1(String str) {
        //initialize vowel count
        int count = 0;
        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {
            //Check whether the current character is a vowel(a,e,i,o,u)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                //increment count when is vowel found
                count++;

            }
        }
        //Return the total value of vowel
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a String To count Vowels:");
        Scanner sc = new Scanner(System.in);
        int countVowels = countVowels1(sc.nextLine());
        System.out.println(countVowels);
    }
}
