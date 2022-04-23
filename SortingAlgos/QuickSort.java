package SortingAlgos;

import java.util.Scanner;
//Quick sort is a Divide and Conquer algorithm.
// It picks an element as pivot and partitions the given array around the picked pivot.
// There are many different versions of quick sort.
// This algorithm is a comparison based algorithm.
// It picks an element as pivot and partitions the given array around the picked pivot.
// There are many different versions of quick sort.
// This algorithm is a comparison based algorithm.
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for (int i:arr){
            System.out.print(i+"    ");
        }

    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);

        }
        else{
            //after each step you can see the progress here
//            for(int i: arr){
//                System.out.print(i+" ");
//            }
            return;
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                int temp=arr[j];
                arr[j]=arr[i+1];
                arr[i+1]=temp;
                i++;

            }
            else{
                continue;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
