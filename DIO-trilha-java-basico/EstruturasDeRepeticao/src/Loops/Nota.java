package Loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

           while(nota < 0 || nota > 10){
               System.out.println("Nota Inválida! Digite novamente: ");
               nota = scan.nextInt();
           }
           if(nota >= 0 || nota <11){
            System.out.println("Sua nota é: " + nota);
        }


    }
}
