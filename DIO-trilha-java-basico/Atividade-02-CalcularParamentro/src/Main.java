public class Main {
    //ATIVIDADE DE RETORNOS
    public static void main(String[] args) {

        //Quadrado:
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Aréa do Quadrado: " + areaQuadrado);

        //Retângulo
        double areaRetangulo = Quadrilatero.area(5d, 8d);
        System.out.println("Aréa do Retângulo: " + areaRetangulo);

        //Trapézio
        double areaTrapezio = Quadrilatero.area(5, 8, 7);
        System.out.println("Aréa do trapézio: " + areaTrapezio);

        //Losango
        double areaLosango = Quadrilatero.area(5f, 8f);
        System.out.println("Aréa do Losango: " + areaLosango);
    }
}