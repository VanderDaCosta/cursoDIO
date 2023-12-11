package Loops.Arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 numeros inteiros aleatorios (0 - 100)
armazene-os em um vetor.
No final mostre os numeros e seus sucessores


*/
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for ( int i = 0 ; i < numerosAleatorios.length ; i++ ){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Antecessores dos numeros aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero - 1) + " ");
        }
        System.out.print("\nNumeros aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos numeros aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero + 1) + " ");
        }
    }
}
