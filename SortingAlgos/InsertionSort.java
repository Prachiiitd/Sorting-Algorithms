package SortingAlgos;

import java.util.Scanner;
//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
//Insertion sort iterates over an array, growing a sorted array behind the current location.
//It takes each element from the input and finds the spot, up to the current point, where that element belongs.
//It does this until it gets to the end of the current sublist.
//Then it inserts the next element and repeats the process.

public class InsertionSort {
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
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
