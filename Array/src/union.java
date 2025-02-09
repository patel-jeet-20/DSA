import java.util.*;
public class union {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> t = new ArrayList<>();
        Set<Integer> r = new HashSet<>();
        for(int i=0;i<n;i++){
            r.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            r.add(arr2[i]);
        }
        for (int it:r){
            t.add(it);
        }

        return t;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        union u = new union();
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter m:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> t = findUnion(arr1,arr2,n,m);
        for(int st:t){
            System.out.print(st+" ");
        }
        sc.close();
    }
}
