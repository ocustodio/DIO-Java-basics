public class Methods {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);

        smartTv.ligar();
        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.escolherCanal(28);
        System.out.println(smartTv.canal);

        smartTv.mudarCanal("cima");
        smartTv.mudarCanal("cima");
        smartTv.mudarCanal("baixo");
        System.out.println(smartTv.canal);
    }

    
    

}
