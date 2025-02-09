import java.util.*;
public class lowerBound {
    public static int findLowest(int[] arr, int target, int n){// n = size of array
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low+high)/2;
            if (arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else low = mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,3,5,8,8,10,10,11};
        int target = sc.nextInt();
        int n = arr.length;
        int ans = findLowest(arr,target, n);
        System.out.println(ans);
    }
}
