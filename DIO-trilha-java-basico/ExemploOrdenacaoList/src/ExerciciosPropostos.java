import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExerciciosPropostos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> temperaturas = new ArrayList<Integer>();

//      Temperaturas

        int contador = 0;
        while (true){
            if(contador ==6){
                break;
            }
            System.out.println("Digite a Temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add((int) temp);
            contador++;
        }
        System.out.println("==================");

//      todas temperaturas
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " || "));

//      calculando e exibindo a média das temperaturas
        double media = temperaturas.stream()
                .mapToDouble(num -> Double.parseDouble(String.valueOf(num)))
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);
    }
}
