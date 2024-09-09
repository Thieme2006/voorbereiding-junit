package nl.han.ica.oose.dea.testedfizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzExecutorTest {

    @Test
    public void executeWithValidIntTest() {
        // Arrange
        var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        assertEquals("37", testValue);
    }
}
