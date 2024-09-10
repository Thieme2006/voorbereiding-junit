package nl.han.ica.oose.dea.testedfizzbuzz.tests.Stringcalculator;

import nl.han.ica.oose.dea.testedfizzbuzz.inits.StringCalcInit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringCalcWithTwoNumbs extends StringCalcInit {

    @Test
    public void addTwoItems() {
        // Act

        int testValue = sut.add("1\n2\n5,8");

        assertEquals(16, testValue);
    }
}
