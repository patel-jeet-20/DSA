import java.lang.*;
public class minInSortedArray {
    public int findMin(int[] nums){
        int low = 0;
        int high = nums.length  -1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[low] <= nums[high]){
                ans = Math.min(ans,nums[low]);
                break;
            }
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }
            else{
                    high = mid-1;
                    ans = Math.min(nums[mid],ans);
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        minInSortedArray m = new minInSortedArray();
        int[] arr = {3,4,5,1,2};
//        int[] arr = {4,5,6,7,0,1,2,3};
//        int[] arr= {7,8,1,2,3,4,5,6};
//        int[] arr = {4,5,0,1,2,3};
        int ans = m.findMin(arr);
        System.out.println(ans);
    }
}
