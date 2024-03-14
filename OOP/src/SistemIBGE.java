public class SistemIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + ", " + e.getNome());
        }

       EstadoBrasileiro estadoPiaui = EstadoBrasileiro.RIO_DE_JANEIRO;

       System.out.println(estadoPiaui.getNomeMaiusculo());
       System.out.println(estadoPiaui.getSigla());
       System.out.println(estadoPiaui.getCodIbge());

    }
}
