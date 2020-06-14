
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {

        RuedaFortuna rueda = new RuedaFortuna();
        rueda.inicializarRueda(0);

        int numFinal = rueda.lanzarRueda();
        System.out.println(">>>-------------------------------------<<<");
        System.out.println("te salió: "+numFinal);

        int mayor = rueda.mayorNum();
        System.out.println("\nEl mayor numero es: "+mayor);

        rueda.Ganaste(mayor);
        System.out.println(">>>-------------------------------------<<<");

    }
}
