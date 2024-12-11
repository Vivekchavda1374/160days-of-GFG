//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        int n = arr.length;

        int maxKadane = kadane(arr);

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int[] invertedArr = new int[n];
        for (int i = 0; i < n; i++) {
            invertedArr[i] = -arr[i];
        }
        int minSubarraySum = kadane(invertedArr);
        int maxCircularSum = totalSum + minSubarraySum; 
        if (maxCircularSum == 0) {
            return maxKadane;
        }
        return Math.max(maxKadane, maxCircularSum);
    }
    private static int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

   
}
