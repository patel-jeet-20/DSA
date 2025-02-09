// checking if array is sorted is not
import java.util.*;
public class practice3 {
    public static boolean checkSorted(int[] arr){
        boolean sort = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                sort = true;
            }
            else{
                sort = false;
                break;
            }

        }
        return sort;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice3 p = new practice3();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = practice3.checkSorted(arr);
        System.out.println(ans);
        sc.close();
    }
}
