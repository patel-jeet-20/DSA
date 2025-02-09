import java.util.*;
public class premutation
{
    static void swap(int[] nums,int l,int i){
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }
    public static void permutations(ArrayList<int[]> ans,int[] nums,int l,int h){
        if(l == h){
            ans.add(Arrays.copyOf(nums, nums.length));
            return;
        }
        for(int i=l;i<h;i++){
            swap(nums,l,i);
            permutations(ans,nums,l+1,h);
            swap(nums,l,i);
        }
    }
    public static ArrayList<int[]> permute(int[] nums){
        ArrayList<int[]> ans = new ArrayList<>();
        int x = nums.length;
        permutations(ans, nums, 0,x);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<int[]> res = permute(nums);
        for(int[] x:res){
            for(int ans:x){
                System.out.print(ans);
            }
            System.out.println();
        }

    }
}
