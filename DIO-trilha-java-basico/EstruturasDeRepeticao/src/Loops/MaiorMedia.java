package Loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int contador = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero > maior){
                maior = numero;
            }
            contador = contador + 1;
        } while(contador < 5);
        System.out.println("O número maior é :" + maior);
    }
}
