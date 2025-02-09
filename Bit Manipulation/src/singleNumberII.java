import java.util.*;
public class singleNumberII {
//    Brute Force Approach
    public int uniqueNumber(int[] nums){
        Map<Integer, Integer>mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])) {
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            }
            else{
                mpp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> m:mpp.entrySet()){
            if(m.getValue().equals(1)){
                return m.getKey();
            }
        }

        return -1;
    }
//    optimal Solution
    public int sortNums(int[] nums){
        Arrays.sort(nums);
        int i = 1;
        while(i<nums.length){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
            i+=3;
        }
        return nums[nums.length-1];
    }
//    Better Approach
    public int betterApr(int[] nums){
        int ones = 0;
        int twos = 0;
        for(int i=0;i<nums.length;i++){
            ones = (ones ^ nums[i]) & (~twos);
            twos = (twos ^ nums[i]) & (~ones);
        }
        return ones;
    }
    public static void main(String[] args) {
        singleNumberII s = new singleNumberII();
        int[] arr = {2,2,1,2,1,1,4,3,4,4};
//        int[] arr= {2,3,2,3,1,4,1,1,2};
//        int ans = s.uniqueNumber(arr);
//        System.out.println(ans);
//        int ans2 =  s.sortNums(arr);
//        System.out.println(ans2);
        int res = s.betterApr(arr);
        System.out.println(res);
    }
}
