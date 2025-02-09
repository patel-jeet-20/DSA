import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sorting ss = new sorting();
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
//        ss.selectionSort(arr,s);
//        for(int i=0;i<s;i++){
//            System.out.print(arr[i]+" ");
//        }
//        ss.bubbleSort(arr, s);
//        for(int i=0;i<s;i++){
//            System.out.print(arr[i]+" ");
//        }
        ss.insertionSort(arr, s);
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}