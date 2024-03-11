import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionsExamples {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a24.3");
            System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("Valor indevido " + e);
        }
    }
}
