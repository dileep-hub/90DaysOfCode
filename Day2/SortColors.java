package com.dileep.Day2;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {

        int[] n = {2,0,2,1,1,0};
        sortColors(n);

        System.out.println(Arrays.toString(n));

    }

    public static void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i=0; i<nums.length; i++) {
            switch (nums[i]) {
                case 0: {
                    zero++;
                } case 1 : {
                    one++;
                } case 2 : {
                    two++;
                }
            }
        }

        for(int i=0; i<zero; i++) {
            nums[i] = 0;
        }
        for(int i=zero; i<one; i++) {
            nums[i] = 1;
        }
        for(int i=one; i<two; i++) {
            nums[i] = 2;
        }


    }

}
