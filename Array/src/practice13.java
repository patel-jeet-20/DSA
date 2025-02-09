import java.util.*;
public class practice13 {
//    Brute Force Approach TC = O(N^2)
    public int lenOfLongSubarr1(int[] A, int N,int K){
        int len = 0;
        for(int i=0;i<N;i++){
//            System.out.println("->"+A[i]);
            int sum = 0;
            for(int j=i;j<N;j++){
                sum += A[j];
                System.out.println("#->"+sum);
                if(sum == K){
                    len = Math.max(len, j-i+1);
                    System.out.println("$->"+len);
                }
            }
            System.out.println();
        }
        if (len == 0){
            return 0;
        }
        return len;
    }
//    optimal approach for positive and negatives
    public static int lenOfLongSubarr(int[] A, int N, int K)
    {
        HashMap<Integer, Integer> mpp  = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int i = 0; i < N; i++) {
            len += A[i];

            if (len == K) {
                sum = i + 1;
            }

            else if (mpp.containsKey(len - K)) {
                sum = Math.max(sum,i - mpp.get(len - K));
            }

            if (!mpp.containsKey(len)) {
                mpp.put(len, i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        practice13 p = new practice13();
        int maxi = 0;
//        int arr[]= {10, 5, 2, 7, 1, 9};
//        int arr[] = {-1,3,2};
//        int arr[] = {-1,1,1};
        int[] arr = {   -13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19,-3, 2, -9, -6};
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
//        System.out.println(maxi);
        int N = arr.length;
//        System.out.println(N);
        int K = 15;
//        int K=1;
//        int ans = p.lenOfLongSubarr1(arr, N, K);
        int ans = practice13.lenOfLongSubarr(arr,N,K);
        System.out.println(ans);
    }
}
