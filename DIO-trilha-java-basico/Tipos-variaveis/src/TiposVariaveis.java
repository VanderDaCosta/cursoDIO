public class TiposVariaveis {
    public static void main(String[] args) {

        //Podem ter os valores alterados
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Não pode ter o valor alterado pois é uma constante
        final double SALARIO_MINIMO = 2500;
    }
    
}