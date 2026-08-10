package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class anagramQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputFirst = in.nextLine();
        inputFirst = inputFirst.toLowerCase();
        String inputSecond = in.nextLine();
        inputSecond = inputSecond.toLowerCase();
        ArrayList<String> listFirst = new ArrayList<>();
        ArrayList<String> listSecond = new ArrayList<>();
        //Store first input in ArrayList First
        for (int i = 0; i < inputFirst.length(); i++) {
            listFirst.add(inputFirst.substring(i, i + 1));
        }
        //Store first input in ArrayList Second
        for (int i = 0; i < inputSecond.length(); i++) {
            listSecond.add(inputSecond.substring(i, i + 1));
        }
        //Sort to Second arraylist
        listSecond.sort(Collections.reverseOrder());
        //Sort to first arraylist
        listFirst.sort(Collections.reverseOrder());
        //Check first and second arraylist is equal or not
        if (listFirst.equals(listSecond)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


    }
}
