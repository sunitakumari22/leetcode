// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    
    public static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = nums1[i++];
        }
        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }

    public static double findMedian(int[] merged) {
        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2]; 
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first list of numbers (sorted, space-separated): ");
        String[] input1 = scanner.nextLine().split(" ");
        int[] num1 = new int[input1.length];

        for (int i = 0; i < input1.length; i++) {
            num1[i] = Integer.parseInt(input1[i]);
        }

        System.out.print("Enter the second list of numbers (sorted, space-separated): ");
        String[] input2 = scanner.nextLine().split(" ");
        int[] num2 = new int[input2.length];

        for (int i = 0; i < input2.length; i++) {
            num2[i] = Integer.parseInt(input2[i]);
        }

        int[] mergedArray = mergeSortedArrays(num1, num2);
        double median = findMedian(mergedArray);

        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
        System.out.println("Median: " + median);

        scanner.close();
    }
}
