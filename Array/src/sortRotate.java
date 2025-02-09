import java.util.*;
public class sortRotate {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sortRotate s = new sortRotate();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = s.check(arr);
        System.out.println(ans);
        
    }
}
