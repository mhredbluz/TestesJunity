package math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTestS4 {
    private static SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }


    // ######## Testes Parametrizados ########

    @DisplayName("Test double division [firstNumber, secondNumber, expected]")
    @ParameterizedTest
    //@MethodSource("testDivisionInputParameters")
    //@MethodSource()
    /*@CsvSource({
            "6.2, 2, 3.1",
            "71, 14, 5.07",
            "18.3, 3.1, 5.90"
    })*/
    /*@CsvSource({
            "Pelé, Football",
            "Senna, F1",
            "Keith Moon, ''"
    })*/
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivisionWithPositiveNumbers(double firstNumber, double secondNumber, double expected) {

        System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected + "!" );
        double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual, 2D, () -> "Division failed: " + firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }

   /* //public static Stream<Arguments> testDivisionInputParameters() {
    public static Stream<Arguments> testDivisionWithPositiveNumbers() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.90D)
        );
    }*/


    // ######## Testes Parametrizados com value source ########

    @ParameterizedTest
    @ValueSource(strings = {"Pelé" , "Senna", "Keith Moon"})
    void testValueSource(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }




}
