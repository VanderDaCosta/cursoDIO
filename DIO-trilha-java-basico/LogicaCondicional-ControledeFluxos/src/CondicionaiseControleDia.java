public class CondicionaiseControleDia {
    public static void main (String[] args){
        String diaSemana = "Quarta";
        int numero = 5;

        switch (diaSemana){
            case "Domingo":
                System.out.println("Dia 01");
                break;
            case "Segunda":
                System.out.println("Dia 02");
                break;
            case "Terça":
                System.out.println("Dia 03");
                break;
            case "Quarta":
                System.out.println("Dia 04");
                break;
            case "Quinta":
                System.out.println("Dia 05");
                break;
            case "Sexta":
                System.out.println("Dia 06");
                break;
            case "Sabado":
                System.out.println("Dia 07");
                break;
            default:
                System.out.println("Reveja o dia da semana e tente novamente");
        }
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                break;
        }
    }
}
