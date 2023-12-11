package Loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero ;

        System.out.println("Qual o número que deseja fazer a tabuada?");
        numero = scan.nextInt();
        System.out.println("Tabuada de " + numero);

        for ( int x = 1 ; x <= 10 ; x++ ){
            int resultado = numero * x;
            System.out.println(numero + " x " + x + " = " + resultado);
        }

    }
}
