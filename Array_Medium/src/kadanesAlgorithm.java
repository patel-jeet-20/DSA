import java.util.*;
import java.lang.*;
public class kadanesAlgorithm {
    public static int bruteApproach(int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                for(int k = i;k<j;k++){
                    sum += nums[k];
                    maxi = Math.max(maxi,sum);
                }
            }
        }
        return maxi;
    }
    public static int betterApproach(int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public static int optimalApproach(int[] nums){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
//        int sIndex = 0;
//        int lIndex = 0;
//        int start = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            maxi = Math.max(sum,maxi);
//            if(sum == 0) start = i;
//            sIndex = start;
//            lIndex = i;
            if(sum < 0) sum = 0;
        }
        return maxi;
    }

    public static void main(String[] args) {
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr = {4,3,1,5,6};
//        int ans = kadanesAlgorithm.bruteApproach(arr);
//        int ans = kadanesAlgorithm.betterApproach(arr);
        int ans = kadanesAlgorithm.optimalApproach(arr);
        System.out.println(ans);
    }
}
