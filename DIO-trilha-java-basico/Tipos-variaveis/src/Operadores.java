public class Operadores {
    public static void main(String[] args){
        double soma = 15 + 8;
        int subtracao = 41 - 8;
        int multiplicacao = 5 * 14;
        int divisao = 14 / 4;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        //Expreções relacioanais
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!");
        }
        if(condicao1 || condicao2){
            System.out.println("Umas das condições é verdadeira!");
        }

        /*
        ---> Expressão booleana
        Boolean simNao = a == b;
        System.out.println("Numero a é igual ao numero b? " + simNao);

        --->Modelo de operações ternarias
        String Resultado = a == b ? "Numeros iguais" : "Numeros diferes";
        System.out.println(Resultado);

         String Resultado = " ";
        if(a == b){
            Resultado = "Verdadeiro";
        }else{
            Resultado = "Falso";
        }
        System.out.println(Resultado);

       ---> Repetição
        int numero = 5;
        for ( int x = 0 ; numero < 20; numero++) {
            //System.out.println(variavel);
        }

      ---> Concatenação
        String nomeCompleto = "Linguaqgem " + "Java";
        */

    }
}
