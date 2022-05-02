package hw9Test;

import hw9.AreMultiplyThreeAndFive;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreMultiplyThreeAndFiveTest {

    @RepeatedTest(5)
    @Order(1)
    public void testAreMultiplyThreeAndFiveHappyPath (){
        int m = 225;
        String expectedResult = "Good Number";

        AreMultiplyThreeAndFive threeAndFiveObject = new AreMultiplyThreeAndFive();
        String actualResult = threeAndFiveObject.AreMultiplyThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreMultiplyThreeAndFiveHappyPathMultiplyThree (){
        int m = 3;
        String expectedResult = "Bad Number";

        AreMultiplyThreeAndFive threeAndFiveObject = new AreMultiplyThreeAndFive();
        String actualResult = threeAndFiveObject.AreMultiplyThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreMultiplyThreeAndFiveHappyPathMultiplyFive (){
        int m = 5;
        String expectedResult = "Poor Number";

        AreMultiplyThreeAndFive threeAndFiveObject = new AreMultiplyThreeAndFive();
        String actualResult = threeAndFiveObject.AreMultiplyThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreMultiplyThreeAndFiveHappyPathNotMultiply (){
        int m = 226;
        String expectedResult = "-1";

        AreMultiplyThreeAndFive threeAndFiveObject = new AreMultiplyThreeAndFive();
        String actualResult = threeAndFiveObject.AreMultiplyThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
