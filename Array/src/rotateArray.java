import javax.swing.*;
import java.util.*;
public class rotateArray {
    public void rotate1(int[] arr,int n){
         int temp = arr[0];
         for(int i=1;i<arr.length;i++){
             arr[i-1] = arr[i];
         }
         arr[n-1] = temp;
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+"\t");
         }
    }
    public void leftArray(int[] arr,int n,int d){
        d %= n;
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public void rightArray(int[] arr,int n,int d){
        d %= n;
        for(int i=0;i<n;i++){
            if(i<d){
                System.out.print(arr[(n-d)+i]+" ");
            }
            else {
                System.out.print(arr[i-d]+" ");
            }
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rotateArray r = new rotateArray();
        System.out.print("Enetr size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter d:");
        int d = sc.nextInt();
//        r.rotate1(arr, n);
//        r.leftArray(arr, n,d);
        r.rightArray(arr,n,d);
        sc.close();
    }

            }