package com.core.codingTest;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubarrayWithDegree
{
    public static int findShortestSubarray(int[] nums) 
    {
        if (nums == null || nums.length == 0) 
        {
            return 0;
        }

        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        Map<Integer, Integer> lastOccurrence = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxDegree = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            // Update the last occurrence index for the current element
            lastOccurrence.put(num, i);
            
            // If it's the first occurrence, record it
            if (!firstOccurrence.containsKey(num)) {
                firstOccurrence.put(num, i);
            }
            
            // Update the frequency count for the current element
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            
            // Calculate the degree of the array
            maxDegree = Math.max(maxDegree, frequency.get(num));
        }

        for (int num : nums) {
            if (frequency.get(num) == maxDegree) {
                int length = lastOccurrence.get(num) - firstOccurrence.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        int minLength = findShortestSubarray(nums);
        System.out.println("Smallest subarray length with the same degree= " + minLength); // Output: 2
    }
}

