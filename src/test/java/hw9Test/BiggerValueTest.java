package hw9Test;

import hw9.BiggerValue;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @RepeatedTest(2)
    @Order(1)
    public void testBiggerValueHappyPathBigger(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue BiggerValueObject = new BiggerValue();
        int actualResult = BiggerValueObject.BiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathMinusNumbers(){
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue BiggerValueObject = new BiggerValue();
        int actualResult = BiggerValueObject.BiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathMinusPlusNumbers(){
        int a = 3333;
        int b = -9999;
        int expectedResult = 3333;

        BiggerValue BiggerValueObject = new BiggerValue();
        int actualResult = BiggerValueObject.BiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueHappyPathMinusZeroNumbers(){
        int a = 0;
        int b = -9999;
        int expectedResult = 0;

        BiggerValue BiggerValueObject = new BiggerValue();
        int actualResult = BiggerValueObject.BiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testBiggerValueNegativeZeroNumbers(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue BiggerValueObject = new BiggerValue();
        int actualResult = BiggerValueObject.BiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testBiggerValueNegativeEqualNumbers(){
        int a = 3333;
        int b = 3333;
        int expectedResult = 0;

        BiggerValue BiggerValueObject = new BiggerValue();
        int actualResult = BiggerValueObject.BiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
