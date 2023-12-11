public class RodarAplicacao1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //UPCAST - não precisamos dizer qual é o "pai"
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //DOWNCAST - precisamos dizer para qual é o "filho" que queremos transformar o "pai"
        // Gerente gerente = new Funcionario();
        //Faxineiro faxineiro1 =(Faxineiro) new Funcionario();
    }
}
