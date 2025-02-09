import java.util.*;
public class sumOfEven {
    public void even(int n){
        int res = 0;
        int num =2;
        int i = 2;
        while (i<=n){
            res+=num;
            num+=2;
            i+=2;
        }
        System.out.println("The of all even numbers till "+n+" is "+res+".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumOfEven s = new sumOfEven();
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            s.even(n);
        }
    }
}
