package Array;

import java.util.Scanner;

public class sortZeroAndOneAndTwo {
    //Sort array containing 0S , 1S and 2S
    static int[] sortArray(int[] arr) {
        //Left points to the position where 0 should be placed
        int left = 0;
        //Mid is used to check current element
        int mid = 0;
        //Right points to the positon where 2 should be placed
        int right = arr.length - 1;
        //Process the unknown part of the array
        while (mid <= right) {
            //Store temporarily value
            int temp = 0;
            //Move to the right
            if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
            }
            //Move to the left
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
            }
            //Check if left = 0 then increase
            if (arr[left] == 0) {
                left++;
            }
            //Check if right = 2 then decrease
            if (arr[right] == 2) {
                right--;
            }
            //it is use to increase mid value
            if (arr[mid] == 1 || arr[mid] == 0) {
                mid++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] methodCall = sortArray(arr);
        for (int i : methodCall) {
            System.out.print(i + " ");
        }
    }
}
