package hw9Test;

import hw9.OddEven;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @RepeatedTest(5)
    @Order(1)
    @Test
    public void testOddEvenHappyPathOdd() {
        int a = -345;
        String expectedResult = "Odd";// Arrange

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);// Act

        Assertions.assertEquals(expectedResult, actualResult);//Assert
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathEvenZero() {
        int a = 0;
        String expectedResult = "Even";// Arrange

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);// Act

        Assertions.assertEquals(expectedResult, actualResult);//Assert
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEven() {
        int a = 222222;
        String expectedResult = "Even";// Arrange

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);// Act

        Assertions.assertEquals(expectedResult, actualResult);//Assert
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathEvenMax() {
        int a = Integer.MAX_VALUE + 1;
        String expectedResult = "Undefined";// Arrange

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);// Act

        Assertions.assertEquals(expectedResult, actualResult);//Assert
    }

    @Test
    public void testOddEvenHappyPathEvenMin() {
        int a = Integer.MIN_VALUE - 1;
        String expectedResult = "Undefined";// Arrange

        OddEven oddEvenObject = new OddEven();
        String actualResult = oddEvenObject.OddEven(a);// Act

        Assertions.assertEquals(expectedResult, actualResult);//Assert
    }


}
