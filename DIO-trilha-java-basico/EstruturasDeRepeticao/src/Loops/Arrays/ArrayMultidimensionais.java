package Loops.Arrays;

import java.util.Random;

/*
Gere e imprima um ARRAY multidimensional de 4 linhas e 4 colunas
*/

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();
        // indicando que é um ARRAY MULTIDIMENSIONAL
        // Primeiro para de colchetes representa a linha
        // e o segundo, representa a coluna
        int [][] arrayM = new int[4][4];

        for(int i = 0 ; i < arrayM.length ; i++){
            for(int j = 0 ; j < arrayM[i].length ; j++ ){
                arrayM[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for ( int[] linha : arrayM ) {
            for ( int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
