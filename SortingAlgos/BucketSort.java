package SortingAlgos;
//Bucket sort is a sorting algorithm that works by distributing the elements of an array into a number of buckets.
// Each bucket is then sorted individually, either using a different sorting algorithm or by direct comparison of the elements within the bucket.
// Bucket sort is a variation of the selection sort algorithm. It is a comparison sort, and is a counting sort algorithm as well,
// since it uses the frequencies of the values to be sorted to assign elements to buckets.
// Bucket sort is an unstable sorting algorithm that has O(n2) time complexity, and O(n) additional space complexity.
// Bucket sort is a comparison sort, meaning that it can sort in-place.
// Bucket sort is a simple sorting algorithm that works by distributing the elements of an array into a number of buckets.
// Each bucket is then sorted individually, either using a different sorting algorithm or by direct comparison of the elements within the bucket.

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void sort(int[] arr) {

    }
}
