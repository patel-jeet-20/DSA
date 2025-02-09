import java.util.*;
public class rearrangeBySign {
    public int[] bruteForce(int[] nums){
        int n = nums.length;
        int[]ans = new int[n];
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negative.add(nums[i]);
            }
            else {
                positive.add(nums[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            ans[2*i] = positive.get(i);
            ans[2*i+1] = negative.get(i);
        }
        return ans;
    }
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int positive = 0;
        int negative = 1;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] < 0){
                ans[negative] = nums[i];
                negative += 2;
            }
            else{
                ans[positive] = nums[i];
                positive += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        rearrangeBySign r = new rearrangeBySign();
        int[] arr = {-3,1,2,-5,2,-4};
        int[] ans = r.rearrangeArray(arr);
//        int[] ans = r.bruteForce(arr);
        for(int a:ans){
            System.out.print(a+" ");
        }
    }
}
