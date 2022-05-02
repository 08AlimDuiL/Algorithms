package hw9Test;

import hw9.MinMaxAve;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    @RepeatedTest(5)
    @Order(1)
    public void testMinMaxAveHappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = 2;
        int indexB = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve MinMaxAveObject = new MinMaxAve();
        int[] actualResult = MinMaxAveObject.MinMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(2)
    public void testMinMaxAveHappyPathOne() {
        int[] array = {700000};
        int indexA = 0;
        int indexB = 0;
        int[] expectedResult = {700000, 700000, 700000};

        MinMaxAve MinMaxAveObject = new MinMaxAve();
        int[] actualResult = MinMaxAveObject.MinMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(3)
    public void testMinMaxAveHappyPathZero() {
        int[] array = {0, 0, 0, 0, 0};
        int indexA = 0;
        int indexB = 0;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve MinMaxAveObject = new MinMaxAve();
        int[] actualResult = MinMaxAveObject.MinMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test()
    @Order(4)
    public void testMinMaxAveHappyPathBackward() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexA = 6;
        int indexB = 2;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve MinMaxAveObject = new MinMaxAve();
        int[] actualResult = MinMaxAveObject.MinMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(5)
    public void testMinMaxAveNegativ() {
        int[] array = {1, 2, 3};
        int indexA = 0;
        int indexB = 3;
        int[] expectedResult = {};

        MinMaxAve MinMaxAveObject = new MinMaxAve();
        int[] actualResult = MinMaxAveObject.MinMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(6)
    public void testMinMaxAveNegativMinusIndex() {
        int[] array = {1, 2, 3};
        int indexA = -1;
        int indexB = 2;
        int[] expectedResult = {};

        MinMaxAve MinMaxAveObject = new MinMaxAve();
        int[] actualResult = MinMaxAveObject.MinMaxAve(array, indexA, indexB);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
