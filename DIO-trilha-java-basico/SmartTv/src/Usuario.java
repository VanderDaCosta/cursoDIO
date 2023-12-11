/**
 * <h1>Usuario</h1>
 * É um arquivo que tem modificações
 * diretas no arquivo "SmartTv"
 */
public class Usuario {
    public static void main (String[] args)throws Exception{
        // A forma de criar uma classe, um dos metodos de atributo
        SmartTv smartTv = new SmartTv();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Ela está em qual canal: " + smartTv.canal);
        System.out.println("Está em qual volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Abaixou o volume: " + smartTv.volume);

        smartTv.aumentarVolume();
            System.out.println("Aumentou o volume: " + smartTv.volume);

        smartTv.ligar();
            System.out.println("A tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
            System.out.println("A tv está ligada? " + smartTv.ligada);

    }
}
