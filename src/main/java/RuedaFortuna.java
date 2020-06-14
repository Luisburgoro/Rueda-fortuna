
import java.util.Scanner;

public class RuedaFortuna {

    Scanner intro = new Scanner(System.in);
    private int[] casillas;
    int num;
    public void inicializarRueda(int numeroCasillas) {

        System.out.println("Cuantas casillas va a escoger ?");
        numeroCasillas = intro.nextInt();



            casillas = new int[numeroCasillas];




        if (numeroCasillas >= 4 && numeroCasillas <= 100) {


                for (int i = 0; i < casillas.length; i++) {

                    System.out.println("girando...");
                    casillas[i] = (int) (Math.random() * 999999999);

                    // System.out.println(casillas[i]);//(opcional si quieren ver los números que imprime la consola)
                }
            } else {

                System.out.println("\ningresa un numero mayor o igual a 4 y menor o igual a 100");
                System.out.println("");
                inicializarRueda(numeroCasillas);
            }

    }


    public int lanzarRueda() {

         num = (int) (Math.random() * casillas.length + 0);



        return casillas[num];
    }

    public int mayorNum() {
        int mayor;
        mayor = casillas[0];
        for (int i = 0; i < casillas.length; i++) {
            if (mayor < casillas[i]) {
                mayor = casillas[i];

            }
        }
        return mayor;


    }

    public void Ganaste(int mayor) {

    if (mayor == casillas[num]) {

        System.out.println("Ganaste!!!");
    } else {
        System.out.println("no obtuviste el máximo");
    }


    }

}