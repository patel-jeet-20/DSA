import java.lang.*;
import java.util.*;
import java.io.*;

class printN {
    int cnt = 1;
    int s = 0;

    public void printNos(int N) {
//        System.out.println("copy:"+copy);
        if (N == 0) {
            return;
        }
        System.out.println(cnt);
        cnt += 1;
        printNos(N - 1);

    }
    public void NtoO(int n) {
        int temp = n;
        if (temp == 0) {
            return;
        }
        System.out.print(temp + " ");
        NtoO(n - 1);
    }
    public void sumON(int n) {
        if (n < 1) {
            System.out.println("sum:" + s);
            return;
        }
        s += n;
        sumON(n - 1);

    }
    public int sumOnFR(int n){   // FR functional Recursion
        if(n == 0){
            return 0;
        }
        return n+sumOnFR(n-1);
}
    public long SumOfSeries(long n){
        if(n == 0){
            return 0;
        }
        return (long) (Math.pow(n,3)+SumOfSeries(n-1));
    }
    public int factorial(int n){
        if(n == 0){
            return 1;
        }
        return  n*factorial(n-1);
    }
    public static ArrayList<Long> factorialNumber(long n){
        ArrayList<Long> a = new ArrayList<>();
        long fact = 1;
        for(long i =1;i<=n;i++){
            fact*=i;
            a.add(fact);
            if(fact > n){
                a.remove(fact);
                break;
            }
        }
        return a;
    }
}
