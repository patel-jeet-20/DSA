// largest element in an array
import java.util.*;
public class practice1 {
    public void largest(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest element is:"+max);
    }
    public static void main(String[] args) {
        practice1 p = new practice1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        p.largest(arr);
    }
}
