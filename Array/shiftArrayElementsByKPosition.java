package Array;

public class shiftArrayElementsByKPosition {
    static int[] shifElementByKPosition(int[]arr,int k){
        //If k is greater then array length ,reduce k
        if (k>arr.length){
            k=k-arr.length;
        }
        //store a k element temporarily
        int []copyArr=new int[k];
        for (int i=0;i<k;i++){
            copyArr[i]=arr[arr.length-1-i];
        }
        int len=arr.length-1;
        //shift right remaining element
        for (int i=arr.length-k-1;i>=0;i--){
            arr[len]=arr[i];
            len--;
        }
        //put the store element at the beginning
        for (int i=0;i<k;i++){
            arr[i]=copyArr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        arr=shifElementByKPosition(arr,6);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
