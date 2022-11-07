import com.epam.lections.tools.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JunitTest {
    Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        Assertions.assertEquals(calculator.sum(1, 4), 5, "Sum is calculated incorrectly");
    }

    @Test
    public void subTest() {
        Assertions.assertEquals(calculator.sub(1, 4), -3, "Sub is calculated incorrectly");
    }

    @ParameterizedTest
    @MethodSource("numberProvider")
    public void sumParametrizedTest(int a, int b, int expected) {
        Assertions.assertEquals(calculator.sum(a, b), expected, "Sum is calculated incorrectly");
    }

    static Stream<Arguments> numberProvider() {
        return Stream.of(
                arguments(1, 2, 3),
                arguments(15, 10, 25),
                arguments(1, 1, 2),
                arguments(5, 21, 26)
        );
    }
}