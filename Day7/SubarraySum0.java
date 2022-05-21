package com.dileep.Day7;

import java.util.HashMap;

public class SubarraySum0 {
    class GfG
    {
        int maxLen(int arr[], int n)
        {
            // Your code here
            HashMap<Integer, Integer> map = new HashMap<>();

            int max = 0;
            int sum = 0;

            for(int i=0; i<arr.length; i++) {
                sum += arr[i];
                if(sum == 0) {
                    max = i+1;
                } else {
                    if(map.get(sum) != null) {
                        max = Math.max(max, i-map.get(sum));
                    } else {map.put(sum, i);};
                }
            }
            return max;
        }
    }
}

//8
//        15 -2 2 -8 1 7 10 23
//
//        Your Output:
//        5
//
//        Expected Output:
//        5

//here we will create a hashmap to store if we wont get sum as zero like on which index

