import java.util.*;
import java.util.*;
public class maxSumInSubArray {
    public static int pairWithMaxSum(List<Integer> arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            int sum = 0;
            sum = arr.get(i) + arr.get(i+1);
            maxi = Math.max(maxi,sum);
        }
        return maxi;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            al.add(t);
        }
        int ans = maxSumInSubArray.pairWithMaxSum(al);
        System.out.println(ans);
    }
}
