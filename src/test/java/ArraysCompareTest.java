import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ArraysCompareTest {

     // test[System Under Test]_[Condition or State Change]_[Expected Result]
         @Test
         void test() {
            int [] numbers = {25,8,21,32,3};
            int [] expectedArray = {3,8,21,25,32};
            Arrays.sort(numbers);

            //compara os objetos
            //assertEquals(numbers, expectedArray);


             //Compara arrays
            assertArrayEquals(numbers, expectedArray);
         }

          // test[System Under Test]_[Condition or State Change]_[Expected Result]
              @Test
              //@Timeout(1)
              @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
              void testSortPerformance() {

                int [] numbers = {25,8,21,32,3};
                for (int i = 0; i < 100000; i++){
                    numbers[0] = i;
                    Arrays.sort(numbers);
                }
              }

}
