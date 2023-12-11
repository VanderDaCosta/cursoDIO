import javafx.scene.input.Mnemonic;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio da Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(5, 1.8);
        Calculadora.multiplicacao(5, 8);
        Calculadora.divisao(6, 3.7);

        //Mensagem
        System.out.println("Exercicio de Mensagem");
        Mensagem.main(6);
        Mensagem.main(17);
        Mensagem.main(20);
        Mensagem.main(4);

        //Emprestimo
        System.out.println("Exercicio de Emprestimo");
        Emprestimo.calcular(1500, 3);
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(3500, 4);

    }
}
