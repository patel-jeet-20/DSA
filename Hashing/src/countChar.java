import java.util.*;
public class countChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int[] hash = new int[256];
        for(int i=0;i<s.length();i++){
            hash[c[i]]+=1;
        }
        int q=sc.nextInt();
        while (q>0){
            char n = sc.next().charAt(0);
            System.out.println(hash[n]);
            q--;
        }

    }
}
