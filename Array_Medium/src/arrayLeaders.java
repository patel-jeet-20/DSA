import java.util.*;
import java.lang.*;
public class arrayLeaders {
    static ArrayList<Integer> Brute(int n, int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
       for(int i=0;i<n;i++){
           int max = arr[i];
           for(int j = i+1;j<n;j++){
               max = Math.max(max,arr[j]);
           }
           if(max == arr[i]){
               al.add(max);
           }
       }

        return al;
    }
    static ArrayList<Integer> leaders(int n,int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        int maxi = arr[n-1];
        for(int i = n-1;i>=0;i--){
            if(arr[i] >= maxi){
                maxi = arr[i];
                al.add(arr[i]);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {5,22,12,13,4,5};
//        ArrayList<Integer> ans = Brute(arr.length, arr);
        ArrayList<Integer> ans = leaders(arr.length,arr);
        for(int i:ans){
            System.out.println(i);
        }
    }
}
