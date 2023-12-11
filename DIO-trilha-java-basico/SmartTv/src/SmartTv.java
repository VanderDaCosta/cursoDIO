/**
 * Um sistema simples para modificar
 * as informações da tv,
 * aqui está todas a funções que
 * estão sendo modificadas no aquivo
 * "Usuario"
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal( int novocanal ){
        canal = novocanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }
    public void ligar(){
        ligada = true;
    }public void desligar(){
        ligada = false;
    }
}
