import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printN p = new printN();
        FFibonacci f = new FFibonacci();
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
//            p.printNos(x);
//            p.NtoO(x);
            p.sumON(x);
//            System.out.print(p.sumOnFR(x));
//            System.out.print(p.SumOfSeries(x));
//            System.out.print(p.factorial(x));
//            System.out.println(printN.factorialNumber(x));
//            f.fib(x);
        }

    }
}