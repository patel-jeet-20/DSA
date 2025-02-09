import java.util.*;
public class singleNumberIII {
    public ArrayList<Integer> singleBrute(int[] nums){
        Map<Integer, Integer> mpp = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i], mpp.get(nums[i])+1);
            }
            else{
                mpp.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> m:mpp.entrySet()){
            if(m.getValue().equals(1)){
                al.add((m.getKey()));
            }
        }
        return al;
    }
    public  int[] singleBetter(int[] nums){
        long xxor = 0;
        for(int i=0;i<nums.length;i++){
            xxor ^= nums[i];
        }
//        long rightmost = ((xxor &(xxor-1))& xxor);
        long rightmost = xxor & (-xxor);
        int[] ans = new int[2];
        for(long num:nums){
            if((num & rightmost) > 0){
                ans[0] ^= num;
            }
            else ans[1] ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        singleNumberIII s = new singleNumberIII();
        int[] arr = {1,2,1,3,2,5};
//        int[] arr = {2,1,2,3,4,1};
//        ArrayList<Integer> ans = s.singleBrute(arr);
//        System.out.println(ans);
        int[] ans1 = s.singleBetter(arr);
        for (int i=0;i<2;i++){
            System.out.print(ans1[i]+" ");
        }

    }
}
