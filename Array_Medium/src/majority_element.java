import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majority_element {
    public int betterApproach(int[] nums){
        Map<Integer, Integer> mpp = new HashMap<>();
        int cmp = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            }
            else{
                mpp.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> m:mpp.entrySet()){
            if(m.getValue() > cmp) return m.getKey();
        }
        return -1;
    }
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            }
             else if (nums[i] == el) cnt++;
            else cnt--;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == el){
                count++;
            }
        }
        if(count > (nums.length/2))
            return el;

        return -1;
    }
    public static void main(String[] args) {
        majority_element m = new majority_element();
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
//        int[] arr = {2,2,1,1,1,2,2};
//        int[] arr = {6,5,5};
//        int ans = m.majorityElement(arr);
        int ans = m.betterApproach(arr);
        System.out.println(ans);

    }
}
