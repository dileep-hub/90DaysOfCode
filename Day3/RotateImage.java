package com.dileep.Day3;

public class RotateImage {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for(int j=i; j<matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for(int j=0; j<matrix[0].length/2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = temp;
            }
        }

    }

}
