package SortingAlgos;

import java.util.Scanner;
//Count sort is an algorithm for sorting a collection of objects according to keys that are small integers;
// it operates by counting the number of objects that have each distinct key value,
// and using arithmetic on those counts to determine the positions of each key value in the output sequence.
// It is a comparison sort, meaning that it can sort items of any type for which a “less-than” relation is defined.
// It is a stable sort, meaning that the relative order of equal sort items is not changed by the sort.
// It is a slow algorithm in the worst case, requiring O(n) extra space for the output array.

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        countSort(arr,n);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void countSort(int[] arr,int n){
        int i,max=0;
        int[] count = new int[100];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(i=0;i<=max;i++){
            count[i]=0;

        }
        for(i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        for(i=1;i<=max;i++){
            count[i]+=count[i-1];
        }
        int[] output = new int[arr.length];
        for(i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;

        }

        for(i=0;i<arr.length;i++){
            arr[i]=output[i];
        }




    }
}
