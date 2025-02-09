import java.util.*;
public class findingMissingNumber {
//    Brute force approach
//    public int missigNumber(int[] nums, int n){
//         for(int i=0;i<n;i++){
//            int flag = 0;
//            for(int k=0;k<n-1;k++){
//                if(nums[k] == i){
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 0){ return i; }
//        }
//        return -1;
//    }

//    better approach TC = O(2N)
//    public int missingNumber(int[] nums){
//        int n = nums.length;
////        System.out.println(n);
//        int[] hash = new int[n];
//        for(int i=0;i<n;i++){
//            hash[nums[i]]+=1;
//        }
//        for(int i=0;i<n;i++){
//            if(hash[i] == 0){
//                return i;
//            }
//        }
//        return -1;
//    }
    public int missingNumber(int[] nums){
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2 += nums[i];
        }
        int missing = sum - sum2;
        return missing;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n+1];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
////            System.out.println("->"+"{"+i+"}"+arr[i]);
//        }
        int[] arr = {3, 0, 1};
        findingMissingNumber m = new findingMissingNumber();
        int ans = m.missingNumber(arr);
        System.out.println(ans);
        sc.close();
    }
}

