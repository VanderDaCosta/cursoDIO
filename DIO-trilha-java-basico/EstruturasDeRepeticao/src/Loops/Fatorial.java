package Loops;

import java.util.Scanner;
 // Shift + F9 - ativa o modo debug
public class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int multiplicacao = 1;

        System.out.println("Qual numero quer fatorar?");
        numero = scan.nextInt();

        for (int x = numero; x >= 1; x--){
            multiplicacao = multiplicacao * x;
        }
        System.out.println( numero+ "! = "+multiplicacao);
    }
}
