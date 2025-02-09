import java.lang.reflect.Array;
import java.util.*;
public class ReverseArr {
    int temp;
    public void reverseArray(int arr[],int s,int l){
        if (arr[s] >= arr[l]) return;
        temp = arr[s];
        arr[s] = arr[l];
        arr[l] = temp;
        reverseArray(arr, s+1, l-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseArr r = new ReverseArr();
        int s = sc.nextInt();
        int[] a = new int[s];
        int l = a.length;
        for(int i=0;i<s;i++) {
            a[i]=sc.nextInt();
        }
        r.reverseArray(a, 0, l-1);
//        for(int i=0;i<s;i++) {
//            System.out.println(a[i]);
//        }
    }


}
