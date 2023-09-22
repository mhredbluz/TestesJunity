package Advanced;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MethodOrderedByOrderIndexTest {

    StringBuilder actualValue = new StringBuilder("");

    @AfterEach()
    void afterEach() {
        System.out.println("The actual value is: " + actualValue);
    }

    // Muito utilizado em testes de integração, quando um teste depende do outro para funcionar.


    @Test
    @Order(1)
    void testC() {
        System.out.println("Running Test C");
        actualValue.append("1");
    }

    @Test
    @Order(2)
    void testD() {
        System.out.println("Running Test D");
        actualValue.append("2");
    }

    @Test
    @Order(4)
    void testA() {
        System.out.println("Running Test A");
        actualValue.append("3");
    }

    @Test
    @Order(3)
    void testB() {
        System.out.println("Running Test B");
        actualValue.append("4");
    }

}
