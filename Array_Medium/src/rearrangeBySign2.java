import java.util.*;
public class rearrangeBySign2 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i:nums){
            if(i<0){
                negative.add(i);
            }
            else{
                positive.add(i);
            }
        }
        if(positive.size() > negative.size()){
            for(int i =0;i<negative.size();i++){
                ans[2*i] = positive.get(i);
                ans[2*i+1] = negative.get(i);
            }
            int index = negative.size()*2;
            for(int i=negative.size();i<positive.size();i++){
                ans[index] = positive.get(i);
                index++;
            }
        }
        else{
            for(int i =0;i<positive.size();i++){
                ans[2*i] = positive.get(i);
                ans[2*i+1] = negative.get(i);
            }
            int index = positive.size()*2;
            for(int i=positive.size();i<negative.size();i++){
                ans[index] = negative.get(i);
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     rearrangeBySign2 r = new rearrangeBySign2();
//     int[] arr = {-3,2,-6,1,3,4};
        int[] arr = {1,2,3,4,-5,-6};
     int[] ans = r.rearrangeArray(arr);
     for(int a:ans){
         System.out.print(a+" ");
     }
    }
}
