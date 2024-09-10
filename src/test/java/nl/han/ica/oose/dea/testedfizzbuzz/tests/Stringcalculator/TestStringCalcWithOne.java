package nl.han.ica.oose.dea.testedfizzbuzz.tests.Stringcalculator;

import nl.han.ica.oose.dea.testedfizzbuzz.inits.StringCalcInit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringCalcWithOne extends StringCalcInit {
    @Test
    public void addInto1 () {
        int testValue = sut.add("1");

        // Assert
        assertEquals(1, testValue);
    }
}
