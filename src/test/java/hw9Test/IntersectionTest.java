package hw9Test;

import hw9.Intersection;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    @RepeatedTest(5)
    @Order(1)
    public void testIntersectionHappyPath(){
        int[] arrayOne = {1, 2, 4, 5, 89};
        int[] arrayTwo = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection IntersectionObject = new Intersection();
        int [] actualResult = IntersectionObject.Intersection(arrayOne,arrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(2)
    public void testIntersectionHappyPathMinusNumbers(){
        int[] arrayOne = {1, 2, 4, 5, 8, 9};
        int[] arrayTwo = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection IntersectionObject = new Intersection();
        int [] actualResult = IntersectionObject.Intersection(arrayOne,arrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(3)
    public void testIntersectionHappyPathAbsent(){
        int[] arrayOne = {1, 2, 4, 5, 89};
        int[] arrayTwo = {8, 9, 45};
        int[] expectedResult = {};

        Intersection IntersectionObject = new Intersection();
        int [] actualResult = IntersectionObject.Intersection(arrayOne,arrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
