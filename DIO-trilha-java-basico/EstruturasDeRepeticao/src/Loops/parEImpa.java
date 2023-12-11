package Loops;

import java.util.Scanner;

public class parEImpa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero ;
        int par = 0, impar = 0;

        System.out.println("Quantidades de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Qual o número: ");
            numero = scan.nextInt();

            count = count + 1;
            if(numero % 2 == 0){
                par = par + 1;
            }else{
                impar = impar + 1;
            }
        } while (count < quantNumeros);

        System.out.println("Foram indentificados " + par + " números pares,");
        System.out.println("e " + impar + " números impares.");
    }
}
