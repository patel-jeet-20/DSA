import java.util.*;
import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for(int i =0;i<s;i++){
            a[i] = sc.nextInt();
        }
//        HashMap<Integer, Integer> map = new HashMap<>();
        int[] map = new int[256];
        for(int i=0;i<s;i++){
            map[a[i]]+=1;
        }
        int q = sc.nextInt();
        while (q>0){
            int n = sc.nextInt();
            System.out.println(map[n]);
            q--;
        }
    }
}
