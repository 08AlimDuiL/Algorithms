package hw9Test;

import hw9.AreNumbersEqual;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    //@RepeatedTest(5)
    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEqualNumbers() {

        int one = 89;
        int two = 89;
        int expectedResult = 0;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsLess() {

        int one = -89;
        int two = 89;
        int expectedResult = -1;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathFirstPlusNumberIsBigger() {

        int one = 89;
        int two = -89;
        int expectedResult = 1;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumbersEqualHappyPathEqualMinusNumbers() {

        int one = -5;
        int two = -5;
        int expectedResult = 0;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAreNumbersEqualHappyPathFirstMinusNumberIsLess() {

        int one = -6;
        int two = -5;
        int expectedResult = -1;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testAreNumbersEqualHappyPathFirstMinusNumberIsBigger() {

        int one = -4;
        int two = -5;
        int expectedResult = 1;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsLessPlus() {

        int one = 4;
        int two = 5;
        int expectedResult = -1;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsBigger() {

        int one = 6;
        int two = 5;
        int expectedResult = 1;

        AreNumbersEqual AreNumbersEqualObject = new AreNumbersEqual();
        int actualResult = AreNumbersEqualObject.AreNumbersEqual(one, two);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
