import java.util.*;
public class quickSort {
    public void swap(int[] arr,int l,int h){
        int temp= arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
    public int partition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = (l-1);
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return (i+1);
    }
    public void sort(int[] arr, int l,int h){
        if(l<h){
            int pi = partition(arr,l,h);
            sort(arr,l,pi-1);
            sort(arr,pi+1,h);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quickSort qs = new quickSort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        qs.sort(arr,0,l-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
