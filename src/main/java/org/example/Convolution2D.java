package org.example;

import java.util.Arrays;

public class Convolution2D {

    public static double[][] convolution2D(double[][] matrizCinza, double[][] kernel) {
        for(int i = 0; i < matrizCinza.length; i++){
            for(int j = 0; j < matrizCinza[0].length; j++) {
                matrizCinza[i][j] = matrizCinza[i][j]*2;
            }
        }
        return matrizCinza;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        double[][] matrizCinza = {{8, 8, 8}, {8, 8, 8}, {8, 8, 8}};
        double[][] kernel = {{1, 0, -1}, {0, 0, 0}, {-1, 0, 1}};
        double[][] saida = convolution2D(matrizCinza, kernel);
        System.out.println(Arrays.deepToString(saida));
    }
}
