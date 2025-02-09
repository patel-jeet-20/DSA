import java.util.*;
public class palindromeString {
    public boolean isPalindrome(String s){
        if(s.isEmpty()) return true;
        char temp;
        String lc = s.toLowerCase();
        String rs = lc.replaceAll(" ", "");
        String ran = rs.replaceAll("[^a-zA-Z0-9]", "");
        char[]  os = ran.toCharArray();
        char[] original = os.clone();
        System.out.println(original);
        int l = os.length;
        int hl = l/2;
        for (int i =0;i<hl;i++) {
            temp = os[i];
            os[i] = os[l-i-1];
            os[l-i-1] = temp;
        }
        System.out.println(os);
        if (Arrays.equals(original, os)) return true;
        else return false;
    }
    public static void main(String[] args) {
        palindromeString ps = new palindromeString();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ps.isPalindrome(s));
    }
}
