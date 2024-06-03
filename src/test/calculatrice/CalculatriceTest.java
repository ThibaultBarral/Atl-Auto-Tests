package test.calculatrice;

import static org.junit.Assert.*;

import com.monprojet.calculatrice.Calculatrice;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

    private com.monprojet.calculatrice.Calculatrice calc;

    @Before
    public void setUp() {
        calc = new Calculatrice();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calc.addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        assertEquals(-1, calc.soustraction(2, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiplication(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.division(6, 3), 0.00001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero() {
        calc.division(1, 0);
    }
}
