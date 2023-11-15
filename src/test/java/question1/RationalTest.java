package question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {
    Rational rational1;
    Rational rational2;

    @BeforeEach
    void init() {
        rational1 = new Rational();
        rational2 = new Rational();
    }



    @Test
    void add() {
        rational1.setNumerator(2);
        rational1.setDenominator(4);
        rational2.setNumerator(6);
        rational2.setDenominator(9);
        assertEquals(7, rational1.add(rational2).getNumerator());
        assertEquals(6, rational1.add(rational2).getDenominator());

    }

    @Test
    void sub() {
        rational1.setNumerator(2);
        rational1.setDenominator(4);
        rational2.setNumerator(6);
        rational2.setDenominator(9);
        assertEquals(-1, rational1.sub(rational2).getNumerator());
        assertEquals(6, rational1.sub(rational2).getDenominator());
    }

    @Test
    void multiple() {
        rational1.setNumerator(2);
        rational1.setDenominator(4);
        rational2.setNumerator(6);
        rational2.setDenominator(9);
        assertEquals(1, rational1.multiple(rational2).getNumerator());
        assertEquals(3, rational1.multiple(rational2).getDenominator());
    }

    @Test
    void devide() {
        rational1.setNumerator(2);
        rational1.setDenominator(4);
        rational2.setNumerator(6);
        rational2.setDenominator(9);
        assertEquals(3, rational1.devide(rational2).getNumerator());
        assertEquals(4, rational1.devide(rational2).getDenominator());
    }

    @Test
    void toFloat() {
        rational1.setNumerator(2);
        rational1.setDenominator(4);
        assertEquals(0.5,Rational.toFloat(rational1));
    }
}