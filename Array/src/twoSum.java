public class twoSum {
    public int[] addTwoNumbers(int[] nums,int target){
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
    }

    public static void main(String[] args) {
        int len = 0;
        int[] arr = {3,2,3};
        int target = 9;
        twoSum t = new twoSum();
        t.addTwoNumbers(arr,target);
    }
}
