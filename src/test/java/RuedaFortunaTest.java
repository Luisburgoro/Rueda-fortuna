import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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




    }

    @Test
    public void lanzarRueda() {


    }

    @Test
    public void mayorNum() {


    }

    @Test
    public void ganaste() {
        Rtest.Ganaste(533333334);
    }
}