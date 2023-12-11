/*
 Classe de exemplo para atividade da Empréstimo de Métodos
*/
public class Emprestimo {
    public static double taxaParcelas() {
    return 0.2;
    }
    public static void calcular (double valor, double qtdParcelas){
        double resultado = valor + (valor * ( qtdParcelas * taxaParcelas()));
        System.out.println("O valor final do emprestimo é " + resultado);
    }
}
