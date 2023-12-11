import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    public static void main(String[] args) {
//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]

        List <Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        notas.set(3, 6.0);
        notas.add(4, 8.0);
        notas.remove(0d);

        System.out.println(notas);
         System.out.println("Cria uma lista e adicione as 7 notas:");

        System.out.print("Exiba a posição da nota 5.0:");
        System.out.println(notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4:");

        System.out.println(notas);

        System.out.println("substitua a nota 5.0 que está na lista pela nota 6.0:");

        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem que foram informados: ");

        for (Double nota: notas) {
            System.out.println();
        }

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba as soma dos valores: " + soma);
        System.out.println("Exiba as medias das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0:" + notas.remove(0));

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Remover todos os parâmetros");
        notas.clear();
        System.out.println(notas);

    }
}
