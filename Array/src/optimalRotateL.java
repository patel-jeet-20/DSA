import java.util.*;
public class optimalRotateL {
    public void reverse(int[] arr,int start,int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public void rotateLeft(int[] arr,int k){
        k %= arr.length;
        reverse(arr, 0 ,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        optimalRotateL l = new optimalRotateL();
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k:");
        int k =sc.nextInt();
        l.rotateLeft(arr, k);
        sc.close();

    }
}
