public class sort0s_1s_2s {
    public static void betterSolution(int[] arr){
        // T.C = O(2N)
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i:arr){
            if(arr[i] == 0) count_0++;
            else if (arr[i] == 1) count_1++;
            else count_2++;
        }
        for(int i=0;i<count_0;i++){
            arr[i] = 0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            arr[i] = 1;
        }
        for(int i =count_0+count_1;i<arr.length;i++){
            arr[i] = 2;
        }
        for(int ans:arr){
            System.out.print(ans+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
//        sort0s_1s_2s.betterSolution(arr);
        sort0s_1s_2s.sortColors(arr);
    }
}
