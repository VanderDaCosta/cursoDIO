public class RodarAplicacao {
    public static void main(String[] args){
        Carro carro1 = new Carro("Vermelho", "Mercedes-Benz Classe C, 90");

        carro1.setCor("Azul");
        carro1.setModelo("AMS Serie  3");
        carro1.setCapTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapTanque());
        System.out.println(carro1.valTotalTanque(6.39));

        //utilizando à sobrecarga
        Carro carro2 = new Carro("Vermelho", "Mercedes-Benz Classe C",90);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapTanque());
        System.out.println(carro2.valTotalTanque(6.39));
    }
}
