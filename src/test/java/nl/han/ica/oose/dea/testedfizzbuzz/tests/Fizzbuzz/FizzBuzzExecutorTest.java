package nl.han.ica.oose.dea.testedfizzbuzz.tests.Fizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

import nl.han.ica.oose.dea.testedfizzbuzz.inits.FizzbuzzExecutorInit;
import org.junit.jupiter.api.Test;

public class FizzBuzzExecutorTest extends FizzbuzzExecutorInit {

    @Test
    public void executeWithValidIntTest() {

        var testValue = sut.execute(37);

        // Assert
        assertEquals("niet deelbaar", testValue);
    }
}
