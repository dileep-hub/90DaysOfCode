package com.dileep.Day6;

public class UniquePaths {

    class Solution {


        public int uniquePaths(int m, int n) {

            int[][] mem = new int[m][n];

            for (int i = 0; i < m; ++i) { // init
                for (int j = 0; j < n; ++j) {
                    mem[i][j] = -1;
                }
            }
            int i = 0;
            int j = 0;
            return helper(i, j, m, n, mem);


        }

        public static int helper (int i, int j, int m, int n, int[][] mem) {

            if(i == m-1 && j == n-1) return 1;

            if(i >= m || j >= n) return 0;

            if(mem[i][j] != -1 ) return mem[i][j];

            return mem[i][j] = helper(i+1, j, m, n, mem) + helper(i, j+1, m, n, mem);

        }


        //     public int uniquePaths(int m, int n) {

//         int i=0;
//         int j = 0;

//         return helper(i, j, m, n);

//     }

//     public static int helper (int i, int j, int m, int n) {
//         if(i == m-1 && j == n-1) {
//             return 1;
//         }

//         if(i >= m || j == n) {
//             return 0;
//         }

//         int a1 = helper(i+1, j, m, n);
//         int a2 = helper(i, j+1, m, n);

//         return a1+a2;

//     }

    }
}


//output
//
//        Example 1:
//        Input: m = 3, n = 7
//        Output: 28
//        Example 2:
//
//        Input: m = 3, n = 2
//        Output: 3
//        Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//        1. Right -> Down -> Down
//        2. Down -> Down -> Right
//        3. Down -> Right -> Down
//
//
//Using DP where we create a 2d array and store the value of the calls which avoid repeatations
//of the same calls next time

