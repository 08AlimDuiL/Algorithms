package hw9Test;

import hw9.SumArray;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    //@RepeatedTest(5)
    @Order(1)
    @Test
    public void testOneSumArrayHappyPathSumOfAllNumbers() {
        int[] differentInteger = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray SumArrayObject = new SumArray();
        int actualResult = SumArrayObject.SumArray(differentInteger);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testTwoSumArrayHappyPathSumOfAllNumbers() {
        int[] differentInteger = new int[]{-7, -3};
        int expectedResult = -10;

        SumArray SumArrayObject = new SumArray();
        int actualResult = SumArrayObject.SumArray(differentInteger);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
