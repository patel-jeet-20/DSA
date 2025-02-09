import java.util.*;
public class firstAndLastPosition {
    public int firstOccurrence(int[] arr, int n,int x){
        int low = 0;
        int high = n-1;
        int first = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return first;
    }
    public int lastOccurrence(int[] arr,int n, int x){
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                last = mid;
                low = mid+1;
            } else if (arr[mid] >= x) {
                high = mid -1;
            }
            else low = mid + 1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int fp = firstOccurrence(nums,n,target);
        if(fp == -1) return new int[] {-1, -1};
        return new int[] {fp, lastOccurrence(nums, n,target)};
    }

    public static void main(String[] args) {
        firstAndLastPosition fl = new firstAndLastPosition();
        int[] arr = {5,7,7,8,8,10};
        int k = 8;
        int[] ans = fl.searchRange(arr, k);
        for(int a:ans){
            System.out.print(a+" ");
        }

    }
}
