package nl.han.ica.oose.dea.testedfizzbuzz.tests.Stringcalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;


import nl.han.ica.oose.dea.testedfizzbuzz.inits.StringCalcInit;
import org.junit.jupiter.api.Test;

public class TestStringCalcEmpty extends StringCalcInit {

    @Test
    public void addInttoThingieTest () {
        int testValue = sut.add("");

        // Assert
        assertEquals(0, testValue);
    }

    //Act

}
