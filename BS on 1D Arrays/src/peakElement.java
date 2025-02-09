public class peakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int low = 1;
        int high = n-2;
        while (low <= high){
            int mid = (low+high)/2;
            if((nums[mid] > nums[mid-1]) && (nums[mid] > nums[mid+1])) return mid;
            else if(nums[mid] > nums[mid-1]){
                low = mid + 1;
            } else if (nums[mid] > nums[mid+1]) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        peakElement p = new peakElement();
//        int[] arr = {1,2,3,1};
//        int[] arr = {1,2,3,4,5,6,7,8,5,1};
//        int[] arr = {1,2,1,3,5,6,4};
//        int[] arr = {5,4,3,2,1};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {4,5,1,2,1};
        int ans = p.findPeakElement(arr);
        System.out.println(ans);
    }
}