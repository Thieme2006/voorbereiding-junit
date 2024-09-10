package nl.han.ica.oose.dea.testedfizzbuzz.tests.Fizzbuzz;

import nl.han.ica.oose.dea.testedfizzbuzz.inits.FizzbuzzExecutorInit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzzOnBuzz extends FizzbuzzExecutorInit {

    @Test
    public void executeWithValidIntTest() {
        // Act
        var testValue = sut.execute(25);

        // Assert
        assertEquals("Buzz", testValue);
    }
}
