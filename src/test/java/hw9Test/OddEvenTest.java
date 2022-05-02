package hw9Test;

import hw9.OddEven;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @RepeatedTest(5)
    @Order(1)
    public void testOddEvenHappyPathOdd() {
        long a = -345;
        String expectedResult = "Odd";

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathEvenZero() {
        long a = 0;
        String expectedResult = "Even";

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEven() {
        long a = 222222;
        String expectedResult = "Even";

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathEvenMax() {
        long a = Integer.MAX_VALUE + 1;
        String expectedResult = "Undefined";

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathEvenMin() {
        long a = Integer.MIN_VALUE - 1;
        String expectedResult = "Undefined";

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
