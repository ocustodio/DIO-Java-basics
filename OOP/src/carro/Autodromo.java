package carro;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1245666");
        System.out.println(jeep.getChassi());
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("125553");
    }
}
