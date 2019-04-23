import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @ParameterizedTest
    @ValueSource(strings = { "Go", "Square 1", "Square 2","Square 3","Square 4" })
    void SquareHasName(String name) {

        Square square = new Square(name);

        assertEquals(name,square.getName());
    }
}