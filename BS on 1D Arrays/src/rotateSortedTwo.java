public class rotateSortedTwo {
    public static boolean Search(int[] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return true;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]){
                System.out.println(nums[low]);
                System.out.println("->"+nums[high]);
                low++;
                high--;
                continue;
            }
            if(nums[low]<= nums[mid]) {
                if ((nums[low] <= target) && (target <= nums[mid])) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if((nums[mid] <= target) && (target <= nums[high])){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int[] arr = {7,8,1,2,3,3,3,4,5,6};
        int[] arr = {1,0,1,1,1};
        int target = 0;
        boolean ans = rotateSortedTwo.Search(arr, target);
        System.out.println(ans);
    }
}
