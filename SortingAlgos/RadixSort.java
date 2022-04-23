package SortingAlgos;

import java.util.Scanner;
//Radix sort is a non-comparative integer sorting algorithm.
//It sorts data with integers by grouping the integers by the individual digits which share the same significant position and value.
//The digits are the positions from right to left in the number.
//The significant position of a digit is called its radix.
//The significant position of the most significant digit is called the most significant radix.
//The most significant radix is usually called base.
//The radix of a number is the position of the most significant digit.
//The radix of 0 is 1.
//The radix of 1 is 2.
//The radix of 2 is 3.
//The radix of 3 is 4.
//The radix of 4 is 5.
//The radix of 5 is 6.
//The radix of 6 is 7.
//The radix of 7 is 8.
//The radix of 8 is 9.
//The radix of 9 is 10.
public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        radixSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            CountSort.countSort(arr, exp);
        }


        }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}