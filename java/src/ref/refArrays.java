package ref;

import java.util.Arrays;

public class refArrays {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.binarySearch(arr,400));

        int[] arr2 = new int[100];
        for(var i : arr2){
            var n = 0;
            arr[n] = n;
            n++;
        }
        int[] arr3 = Arrays.copyOf(arr2,200);
        System.out.println(Arrays.binarySearch(arr,350));
        System.out.println(Arrays.binarySearch(arr2,150));
        System.out.println(Arrays.binarySearch(arr3,150));
        System.out.println(arr[150]);

    }
}
