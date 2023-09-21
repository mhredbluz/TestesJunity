import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleMathTestS3 {
    private static SimpleMath math;

    @BeforeAll
    static void setUp() {
        System.out.println("BeforeAll");
    }
    @AfterAll
    static void cleanUp() {
        System.out.println("AfterAll");
    }
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }
    @AfterEach
    void afterEachMethod() {
        System.out.println("Running AfterEachMethod");
    }

    @Test
    @DisplayName("Should calculate sum with positive numbers")
    void testSumWithPositiveNumbers() {
        //Given / Arrange
        double firstNumber = 6.2;
        double secondNumber = 2.0;
        double expected = 8.2;
        //When / Act
        double actual = math.sum(firstNumber, secondNumber);

        //Then / Assert
        assertEquals(expected, actual, () -> "Sum failed: " + firstNumber + " + " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Should calculate subtraction with positive numbers")
    void testSubtractionWithPositiveNumbers() {
        double firstNumber = 6.2;
        double secondNumber = 2.0;
        double expected = 4.2;

        double actual = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> "Subtraction failed: " + firstNumber + " - " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Should calculate multiplication with positive numbers")
    void testMultiplicationWithPositiveNumbers() {
        double firstNumber = 6.2;
        double secondNumber = 2.0;
        double expected = 12.4;

        double actual = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> "Multiplication failed: " + firstNumber + " * " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Should calculate division with positive numbers")
    void testDivisionWithPositiveNumbers() {
        double firstNumber = 6.2;
        double secondNumber = 2.0;
        double expected = 3.1;

        double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> "Division failed: " + firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Should calculate mean with positive numbers")
    void testMeanWithPositiveNumbers() {
        double firstNumber = 6.2;
        double secondNumber = 2.0;
        double expected = 4.1;

        double actual = math.mean(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> "Mean failed: " + firstNumber + " + " + secondNumber + " mean did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Should calculate square root with positive number")
    void testSquareRootWithPositiveNumber() {
        double firstNumber = 6.2;
        double expected = 2.4899799195977463;

        double actual = math.squareRoot(firstNumber);

        assertEquals(expected, actual, () -> "Square root failed: " + firstNumber + " square root did not produce " + expected + "!");
    }

     // test[System Under Test]_[Condition or State Change]_[Expected Result]
    //@Disabled("TODO: We need still work on it!")
     @DisplayName("Test Division by Zero")
     @Test
     void testDivisionByZero() {
         //Given / Arrange
         double firstNumber = 6.2;
         double secondNumber = 0;

         String expectedMessage = "Impossible to divide by zero!";
         //When / Act
         ArithmeticException actual = assertThrows(
                 ArithmeticException.class, () -> {
             // Then / Assert
             math.division(firstNumber, secondNumber);
         }, () -> "Division by Zero should throw an ArithmeticException");

         assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
     }
}
