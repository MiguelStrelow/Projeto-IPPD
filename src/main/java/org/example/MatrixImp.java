package org.example;

import static java.lang.Math.*;

public class MatrixImp {
    public double[][] matrixSplit(double[][] matrix, int n){
        double[][] half = new double[0][];
        for(int i = 0; i< floorDiv(matrix.length, 2); i++){
            for(int j = 0; j<matrix[0].length; j++){
                half[i][j] = matrix[i][j];
            }
        }
    }
}
