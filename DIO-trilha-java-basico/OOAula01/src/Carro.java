/*
    *Classe criada para exemplo da aula 03 de Orientação á Objetos
 */
class Carro {
    String cor;
    String modelo;
    int capTanque;

    // o tipo de atributo tem que ser igual o tipo do metodo
    Carro(String vermelho, String s){

    }
    //testando a sobrecarga
    Carro(String cor,String modelo, int capTanque){
    this.cor = cor;
    this.modelo=modelo;
    this.capTanque = capTanque;
    //this - é usado para diferenciar o que pertence e o que não pertence ao objeto
    }
    void setCor(String cor){
        this.cor = cor;
        //set serve para setar algum valor em um atributo
    }
    String getCor(){
        return cor;
        //get serve para retornar o valor definido em algum atributo
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }

    void setCapTanque(int capTanque){
        this.capTanque = capTanque;
    }
    int getCapTanque(){
        return capTanque;
    }

    // metodos que fazem uma ação mais complexa, sempre coloque eles por ultimo
    double valTotalTanque(double valorGasolina){
        return capTanque * valorGasolina;
    }
}
