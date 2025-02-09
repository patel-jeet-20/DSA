import java.util.*;

public class countubarrayOfSum {
    public static int bruteforce(int[] arr,int k) {
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int K=i;K<=j;K++)
                    sum += arr[K];
                if (sum == k) cnt++;
            }
        }
        return cnt;
    }

    public static int betterSol(int[] arr, int k){
        int cnt = 0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int pre_sum = 0;
        int cnt = 0;
        mpp.put(0, 1);
        for(int i=0;i<nums.length;i++){
            pre_sum += nums[i];
            int remove =  pre_sum - k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(pre_sum, mpp.getOrDefault(pre_sum, 0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int ans;
//        ans = bruteforce(arr,6);
//        ans = betterSol(arr,6);
        ans = subarraySum(arr, 6);
        System.out.println(ans);
    }
}


