import java.util.HashMap;
import java.util.Map;

public class practice12 {
    public int singleNumber(int[] nums){
//        int n = nums.length;
//        HashMap<Integer, Integer>mpp = new HashMap<>();
//        for(int i=0;i<n;i++){
//           int value = mpp.getOrDefault(nums[i], 0);
////            System.out.println(value);
//           mpp.put(nums[i], value+1);
////            System.out.println(mpp);
//        }
//        for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
//            if(it.getValue() == 1){
//                return it.getKey();
//            }
//        }
        int ans = 0;
        for(final int num:nums){
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        practice12 p = new practice12();
        int[] arr = {-1,-1,-2};
        int ans = p.singleNumber(arr);
        System.out.println(ans);
    }
}
