import java.util.*;
public class sievePrime {
    static final int MAXN = 100001;
    static int[] spf = new int[MAXN];
    static void sieve() {
        spf[0] = 0;
        spf[1] = 1;
        for (int i = 2; i < MAXN; i++) {
            spf[i] = 1;
        }
        for (int i = 2; i < MAXN; i++) {
            if (spf[i] == 1) {
                for (int j = i; j < MAXN; j += i) {
                    spf[j] = i;
                }
            }
        }
    }
    static List<Integer> findPrimeFactors(int N){
        List<Integer> al = new ArrayList<>();
        while(N != 1){
            al.add(spf[N]);
            N = N/spf[N];
        }
        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        List<Integer> ans = findPrimeFactors(n);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
}
