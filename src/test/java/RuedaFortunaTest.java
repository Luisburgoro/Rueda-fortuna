import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class RuedaFortunaTest {

    private RuedaFortuna Rtest;

    @Before
    public void setUp() throws Exception {

        Rtest = new RuedaFortuna();
    }

    @After
    public void tearDown() throws Exception {
        Rtest = null;

    }

    @Test
    public void inicializarRueda() {

            Rtest.inicializarRueda(1000000000);//me referia a ponerle un numero sobre el limite de lo que puede guardar la variable tipo int
            Rtest.inicializarRueda(-3);// me referia a que resiva un arreglo de largo negativo


    }

    @Test
    public void lanzarRueda() {


        Rtest.lanzarRueda();//error con NullPointerException

    }

    @Test
    public void mayorNum() {

        Rtest.mayorNum();//NullPointerException

    }

    @Test
    public void ganaste() {

        Rtest.Ganaste(0);//NullPointerException
    }
}