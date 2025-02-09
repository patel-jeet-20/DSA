import java.util.*;
public class ReverseArray {
    Scanner sc = new Scanner(System.in);
    public void rev() {
        int s = sc.nextInt();
        int[] a = new int[s];
        int l = a.length;
        int mp = l/2;
        int temp;
        for(int i =0;i<s;i++){
            a[i] = sc.nextInt();
        }
//        for(int i =0;i<s;i++){
//            System.out.println(a[i]);
//        }
//        System.out.println(mp);
        for(int i=0;i<=mp;i++){
            temp = a[i];
            a[i] = a[l-1-i];
            a[l-1-i] = temp;
        }
        for(int i =0;i<s;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        r.rev();

    }
}
