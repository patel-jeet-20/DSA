import java.util.*;
import java.lang.*;
class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> al = new ArrayList<>();
        double n = Math.sqrt(N);
        for(int i=2;i<=n;i++){
            if(N%i == 0){
                al.add(i);
            }
            while (N%i == 0){
                N /= i;
            }
        }
        if (N != 1) al.add(N);
        int[] ans = al.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}
public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        int[] ans = s.AllPrimeFactors(n);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
