package Loops.Arrays;
 /*
 Crie um vetor de 6 numeros
 e nistre-os na ordem inversa
 */
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {10, 28, 31, 49, 15, 56};

        System.out.print("Vetor: ");

        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count = count + 1;
        }
        System.out.print("\nVetor inverso: ");

        for(int i = (vetor.length - 1); i >= 0 ; i-- ){
            System.out.print(vetor[i] + " ");
        }
    }
}
