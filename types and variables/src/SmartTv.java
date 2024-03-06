public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--; 
    }
 
    public void mudarCanal(String direcao) {
        if (direcao.toLowerCase() == "cima") this.canal ++;
        if (direcao.toLowerCase() == "baixo") this.canal --;
    }

    public void escolherCanal(int numCanal) {
        this.canal = numCanal;
    }

}
