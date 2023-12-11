import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStremApi {
    public static void main(String[] args) {
        List <String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
//        System.out.println("imprima todos os elementos dessa lista de string: ");
//        numerosAleatorios.forEach(System.out::println);

// Ele vai imprimir apenas quatro desse array pois o metodo SET não aceita
// números repetidos

//        System.out.println("Pegue os 5 primeiros números e coloque dentro de um SET: ");
//        numerosAleatorios.stream().limit(5)
//                .collect(Collectors.toSet()).forEach(System.out::println);


//        System.out.println("Transforme esta lista de String em uma lista de números Inteiros: ");
        List<Integer> numerosAleatorioInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//                .forEach(System.out::println);

//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
//        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
//        System.out.println(ListParesMaioresQue2);

//        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

//        System.out.println("Remova os valores impares: ");
//        numerosAleatorioInteger.removeIf(integer -> (integer % 2 != 0));
//        System.out.println(numerosAleatorioInteger);

        //Para você

//        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//        numerosAleatorios.stream()
//                .skip(3)
//                .forEach(System.out::println);

        System.out.println("Retire os números repetidos da lista, quantos números ficam? ");
        long countNumerosUnicos = numerosAleatorioInteger.stream()
                .distinct()
                .count();
        System.out.println(countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatorioInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Pegue apenas os números pares e some: ");
        int somaDeNumerosPares = numerosAleatorioInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaDeNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numeroOrdemNatural = numerosAleatorioInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numeroOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatorioInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
