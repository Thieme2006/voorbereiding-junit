package nl.han.ica.oose.dea.testedfizzbuzz.inits;

import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.BeforeEach;

public abstract class FizzbuzzExecutorInit {
    protected FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        this.sut = new FizzBuzzExecutor();
    }
}
