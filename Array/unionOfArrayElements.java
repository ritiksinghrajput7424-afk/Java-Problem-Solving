package Array;
import java.util.HashSet;
import java.util.Set;

public class unionOfArrayElements {
    static void printUnionOfArrayElements(int[] arr, int[] arr2) {
        //Store the union of array element
        Set<Integer> set = new HashSet<>();
        //Add and remove duplicates from array
        for (int i : arr) {
            set.add(i);
        }
        //Add and remove duplicates from array2
        for (int i : arr2) {
            set.add(i);
        }
        //Print the union of array element
        System.out.println(set);


    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int arr2[] = {10, 20, 30, 40, 50};
        //Call method to find union
        printUnionOfArrayElements(arr, arr2);
    }
}
