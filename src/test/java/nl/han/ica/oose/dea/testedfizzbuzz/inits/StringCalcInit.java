package nl.han.ica.oose.dea.testedfizzbuzz.inits;

import nl.han.ica.oose.dea.testedfizzbuzz.StringCalculator;
import org.junit.jupiter.api.BeforeEach;

public abstract class StringCalcInit {
    protected StringCalculator sut;
    @BeforeEach
    public void setup() {
        sut = new StringCalculator();
    }
}
