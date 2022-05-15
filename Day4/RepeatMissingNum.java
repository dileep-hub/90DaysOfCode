package com.dileep.Day4;

import java.util.Arrays;

public class RepeatMissingNum {
    public static void main(String[] args) {

        int[] arr = {3,1,2,5,3};
        int[] res = repeatedNumber(arr);
        System.out.println(Arrays.toString(res));

    }

    public static int[] repeatedNumber(final int[] A) {

        int[] arr  = new int[A.length+1];
        int[] res = new int[2];

        for(int ele : A) {
            arr[ele]++;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > 1) {
                res[0] = i;
            } else if(arr[i] == 0) {
                res[1] = i;
            }
        }

        return res;



    }
}
