//remove diplicate elements
import java.util.*;
public class practice4 {
    // brute force
    public Set<Integer> removeDuplicates1(int[] nums) {
    Set<Integer> n = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        n.add(nums[i]);
    }
//        System.out.println(n);
        int l = n.size();
    return n;
    }
//    optimal solution
    public int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        practice4 p = new practice4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
//        Set<Integer> ans = p.removeDuplicates1(nums);
        int ans = p.removeDuplicates(nums);
        System.out.println(ans);
        sc.close();
    }

}
