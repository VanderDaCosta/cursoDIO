public class CondicionaiseControleMes {

    public static void main(String[] args) {
        int mes = 7;

        if(mes == 1){
            System.out.println("O mês é Janeiro");
        } else if (mes == 2) {
            System.out.println("O mês é Fevereiro");
        } else if (mes == 3) {
            System.out.println("O mês é Março");
        }else if (mes == 4){
            System.out.println("O mês é Abril");
        } else if (mes == 5) {
            System.out.println("O mês é Maio");
        } else if (mes == 6) {
            System.out.println("O mês é Junho");
        } else if (mes == 7) {
            System.out.println("O mês é Julho");
        } else if (mes == 8) {
            System.out.println("O mês é Agosto");
        } else if (mes == 9) {
            System.out.println("O mês é Setembro");
        }else if (mes == 10) {
            System.out.println("O mês é Outubro");
        }else if (mes == 11) {
            System.out.println("O mês é Novembro");
        }else if (mes == 12) {
            System.out.println("O mês é Dezembro");
        }else {
            System.out.println("Macho que diabo de mês é esse? " + mes);
        }
        if(mes == 1 || mes == 7 || mes == 12){
            System.out.println("Curta suas FÉRIAS");
        }
    }


}
