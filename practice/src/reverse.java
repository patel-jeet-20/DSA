import java.util.*;
public class reverse {
    public long reversenum(int x){
        int  n = Math.abs(x);
        int res=0;
        while ((n>0)) {
            int rem = n % 10;
            res = (res*10)+rem;
            n = n/10;
        }
        if(res<Integer.MAX_VALUE) return 0;
        if(x<0) return (-1*(int)res);
        else return (int) res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverse r = new reverse();
        int n = sc.nextInt();
        int ans = (int) r.reversenum(n);
        System.out.println(ans);
    }
}
