import java.util.*;
public class AddOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans1=0;
        int ans2=0;
        int num = sc.nextInt();
        String l = Integer.toString(num);
        int lenght = l.length();
        for(int i =1;i<=lenght;i++){
            int rem = num % 10;
            if(rem %2==0){
                ans1+=rem;
            }
            else {
                ans2+=rem;
            }
            num/=10;
        }
        System.out.println(ans1+" "+ans2);
    }
}
