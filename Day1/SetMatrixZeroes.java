package com.dileep.Day1;

public class SetMatrixZeroes {

    class Solution {
        public void setZeroes(int[][] matrix) {

            int[] arrc = new int[matrix[0].length];
            int[] arrr = new int[matrix.length];

            int cl = matrix[0].length;
            int rl = matrix.length;

            for(int i=0; i<rl; i++) {
                for(int j=0; j<cl; j++) {
                    if(matrix[i][j] == 0) {
                        arrc[j] = -1;
                        arrr[i] = -1;
                    }
                }
            }

            for(int i=0; i<rl; i++) {
                for(int j=0; j<cl; j++) {
                    if(arrc[j] == -1 || arrr[i] == -1) {
                        matrix[i][j] = 0;
                    }
                }
            }

        }
    }

}
