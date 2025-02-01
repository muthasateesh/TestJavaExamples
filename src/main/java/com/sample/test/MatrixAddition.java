package com.sample.test;

public class MatrixAddition {

	public static void main(String[] args) {
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        // Add matrices
	        int[][] resultMatrix = addMatrices(matrix1, matrix2);

	        // Display result
	        System.out.println("Resultant Matrix:");
	        for (int i = 0; i < resultMatrix.length; i++) {
	            for (int j = 0; j < resultMatrix[i].length; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        int[][] resultMatrix = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return resultMatrix;
	    }

}
