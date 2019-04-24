import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start... " + testInfo.getDisplayName());
    }

    @ParameterizedTest
    @ValueSource(strings = {  "Square 1", "Square 2","Square 3","Square 4" })
    @DisplayName("SquareHasName Test")
    void SquareHasName(String name) {

        Square square = new RegularSquare(name);

        assertEquals(name,square.getName());
    }
}