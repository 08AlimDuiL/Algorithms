package hw10Test;

import hw10.StringToLettersAndSpaces;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersAndSpacesTest {

    @Test()
    @Order(1)
    public void testStringToLettersAndSpacesHappyPath() {

        String delAllExcLettsAndSpaces = " Abra0125487 -+*/  arbadacarbA .";
        String expectedResult = " Abra   arbadacarbA ";

        StringToLettersAndSpaces excLettsAndSpacesObject = new StringToLettersAndSpaces();
        String actualResult = excLettsAndSpacesObject.StringToLettersAndSpaces(delAllExcLettsAndSpaces);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}





