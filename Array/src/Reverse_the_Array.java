import java.util.*;
public class Reverse_the_Array {
    public static void reverse(ArrayList<Integer> arr,int start, int last){
        while (start<=last){
                Collections.swap(arr, start,last);
                start++;
                last--;
        }
    }
    public static void reverseArray(ArrayList<Integer> arr, int m){
        int n = arr.size();
        int start = m+1;
        int last = n-1;
        reverse(arr, start, last);
        for(int ans:arr){
            System.out.print(ans+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
//        arr.add(9);
//        System.out.println(arr.size());
        Reverse_the_Array.reverseArray(arr, position);
    }
}

