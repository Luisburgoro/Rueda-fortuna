import java.util.InputMismatchException;
import java.util.Scanner;

public class RuedaFortuna {

    Scanner intro = new Scanner(System.in);
    private int[] casillas;
    int num;


    public void inicializarRueda(int numeroCasillas) {
        System.out.println( "¿escoge cuantas casillas quieres?");

        try {
            numeroCasillas=intro.nextInt();
            casillas = new int[numeroCasillas];

        }catch(NegativeArraySizeException e){
            System.out.println("no se puede un numero negativo "+e);

        }catch (InputMismatchException e) {
            System.out.println("solo se permiten numeros y entradas que sean válidas " + e);
            intro.next();
        }

        if (numeroCasillas >= 4 && numeroCasillas <= 100) {



                for (int i = 0; i < casillas.length; i++) {

                    System.out.println("girando...");
                    casillas[i] = (int) (Math.random() * 99999);

                    // System.out.println(casillas[i]);//(opcional si quieren ver los números que imprime la consola)
                }
            } else {

                System.out.println("\ningresa un numero mayor o igual a 4 y menor o igual a 100");
                System.out.println("");
                inicializarRueda(numeroCasillas);

            }

    }


    public int lanzarRueda() {

        try {
            num = (int) (Math.random() * casillas.length + 0);

            return casillas[num];
        }catch(NullPointerException e){

        }
        return 0;
    }

    public int mayorNum() {
        int mayor;
      try {
          mayor = casillas[0];
          for (int i = 0; i < casillas.length; i++) {
              if (mayor < casillas[i]) {
                  mayor = casillas[i];

              }
          }
          return mayor;
      }catch (NullPointerException e){

      }
      return 1;
    }

    public void Ganaste(int mayor) {
  try {
      if (mayor == casillas[num]) {

          System.out.println("Ganaste!!!");
      } else {
          System.out.println("no obtuviste el máximo");
      }
  }catch(NullPointerException e){

  }

    }

}