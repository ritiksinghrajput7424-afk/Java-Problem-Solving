package String;

import java.util.Scanner;

public class substringComparisons {
    public static void main(String[] args) {
        //Problem :Substring Comparisons
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = input.next();
        System.out.println("Please a length of substring: ");
        int k = input.nextInt();
        //store all possible substrings
        String[] arr = new String[s.length() - (k - 1)];
        //traverse for find all possible substring
        for (int i = 0; i < s.length() - (k - 1); i++) {
            String temp = s.substring(i, k);
            k++;
            arr[i] = temp;
        }
        String smallest = arr[0];
        String largest = arr[0];
        //Traverse for find smallest and largest
        for (int i = 1; i < arr.length; i++) {
            //Find smallest substring
            if (smallest.compareTo(arr[i]) > 0) {
                smallest = arr[i];
            }
            //Find Largest substring
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];

            }
        }
        System.out.println(smallest);
        System.out.println(largest);

    }
}
