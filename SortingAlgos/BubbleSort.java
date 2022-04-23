package SortingAlgos;

import java.util.Scanner;
//moves the largest of the unsorted elements to the end of the array

public class BubbleSort {
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
    //Bubble sort
    public static int[] sort(int[] arr,int n){
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }



}
