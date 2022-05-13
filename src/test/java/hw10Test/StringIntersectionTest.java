package hw10Test;

import hw10.StringIntersection;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringIntersectionTest {

    @Test()
    @Order(1)

    public void testStringIntersectionHappyPath() {

        String first = "Carrot";
        String second = "carwash";

        String expectedResult = "car";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(2)

    public void testStringIntersectionTwoHappyPath() {

        String first = "Noob";
        String second = "Schmooze";

        String expectedResult = "oo";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(3)

    public void testStringIntersectionThreeHappyPath() {

        String first = "mooNoo";
        String second = "Noob";

        String expectedResult = "oon";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(4)

    public void testStringIntersectionFourHappyPath() {

        String first = "mAAAAe";
        String second = "NAAb";

        String expectedResult = "aa";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(5)

    public void testStringIntersectionFiveHappyPath() {

        String first = "Carrot";
        String second = "carARrott";

        String expectedResult = "carrot";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(6)

    public void testStringIntersectionSixHappyPath() {

        String first = "Carrot";
        String second = "RotcarR";

        String expectedResult = "carrot";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(7)

    public void testStringIntersectionSevenHappyPath() {

        String first = "ROTCarN";
        String second = "carrot";

        String expectedResult = "rotcar";

        StringIntersection intersectionObject = new StringIntersection();
        String actualResult = intersectionObject.StringIntersection(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

