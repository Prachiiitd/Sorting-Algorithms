package SortingAlgos;

import java.util.Scanner;
//Selection sort is a sorting algorithm that works by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
//1) The subarray which is already sorted.
//2) Remaining subarray which is unsorted.

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static int[] sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        return arr;

    }
}
