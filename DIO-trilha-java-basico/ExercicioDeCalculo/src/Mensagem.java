/*
 Classe de exemplo para atividade da Mensagem de Métodos
*/
public class Mensagem {
    public static void main(int numero1){
        switch (numero1){
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemDia();
                break;
            case 13:
            case 14:
            case 15 :
            case 16:
            case 17:
                mensagemTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                mensagemNoite();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mensagemMadrugada();
                break;
            default:
                System.out.println("Hora inválida");
        }
    }
    public static void mensagemDia(){
        System.out.println("Bom dia!!");
    }
    public static void mensagemTarde(){
        System.out.println("Boa tarde!!");
    }
    public static void mensagemNoite(){
        System.out.println("Boa noite!!");
    }
    public static void mensagemMadrugada(){
        System.out.println("Vá dormir, boa madrugada");
    }
}
