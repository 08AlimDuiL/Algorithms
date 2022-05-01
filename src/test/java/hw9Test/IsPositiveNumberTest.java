package hw9Test;

import hw9.IsPositiveNumber;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    //@RepeatedTest(5)
    @Order(1)
    @Test
    public void testPositiveNumberHappyPath(){
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber PositiveNumberObject = new IsPositiveNumber();
        boolean actualResult = PositiveNumberObject.IsPositiveNumber(a);

        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    public void testPositiveNumberHappyPathZero(){
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber PositiveNumberObject = new IsPositiveNumber();
        boolean actualResult = PositiveNumberObject.IsPositiveNumber(a);

        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    public void testPositiveNumberHappyPathMinus(){
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber PositiveNumberObject = new IsPositiveNumber();
        boolean actualResult = PositiveNumberObject.IsPositiveNumber(a);

        Assertions.assertTrue(false);
    }
}
