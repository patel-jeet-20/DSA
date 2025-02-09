import java.util.Scanner;

public class binarySearch {
    public int binary(int[] arr, int low,int high, int target){
        if(low < high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) return binary(arr,low,mid-1,target);
            else return binary(arr, mid+1,high,target);
        }
        return -1;
    }

    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int target = sc.nextInt();
        System.out.println("Element is at index:"+bs.binary(arr, 0, n-1,target));
    }
}
