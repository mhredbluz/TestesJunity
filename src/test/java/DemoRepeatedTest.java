import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @DisplayName("Test Division by Zero")
    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}!")
    void testDivisionByZero(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        System.out.println("Repetition N° " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());

        System.out.println("Running " + testInfo.getTestMethod().get().getName());
        //Given / Arrange
        double firstNumber = 6.2;
        double secondNumber = 0;

        String expectedMessage = "Impossible to divide by zero!";
        //When / Act
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            // Then / Assert
            math.division(firstNumber, secondNumber);
        }, () -> "Division by Zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
    }
}
