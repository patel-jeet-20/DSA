import java.util.*;
public class eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        Boolean[] era = new Boolean[n];
        Arrays.fill(era, true);
        for(int i=2;i<Math.sqrt(n);i++){
            if(era[i]){
                for(int j = (i*i);j<n;j+=i){
                    era[j] = false;
                }
            }
        }
        for(int i=2;i<era.length;i++){
            if(era[i]){
                System.out.println(i);
            }
        }
    }
}
