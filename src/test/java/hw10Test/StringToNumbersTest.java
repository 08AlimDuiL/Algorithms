package hw10Test;

import hw10.StringToNumbers;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersTest {

    @RepeatedTest(2)
    @Order(1)
    public void testStringToNumbersTestHappyPath() {

        String str = "1, 2, 3, 4, 5";
        String[] expectedResult = new String[]{"1", "2", "3", "4", "5"};

        StringToNumbers toNumbersObject = new StringToNumbers();
        String[] actualResult = toNumbersObject.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test()
    @Order(2)
    public void testStringToNumbersTestWithSpacesHappyPath() {

        String str = "1,   2, 3  , 4,   5   ";
        String[] expectedResult = new String[]{"1", "2", "3", "4", "5"};

        StringToNumbers toNumbersObject = new StringToNumbers();
        String[] actualResult = toNumbersObject.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(3)
    public void testStringToNumbersTestWithDifferentSimbolsHappyPath() {

        String str = "  9/2;   2.05; aMbc3; 9++9; -5  99   ";
        String[] expectedResult = new String[]{"9", "2", "2", "05", "3", "9", "9", "5", "99"};

        StringToNumbers toNumbersObject = new StringToNumbers();
        String[] actualResult = toNumbersObject.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}









