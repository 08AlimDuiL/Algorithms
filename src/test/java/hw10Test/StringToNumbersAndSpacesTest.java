package hw10Test;

import hw10.StringToNumbersAndSpaces;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersAndSpacesTest {

    @Test()
    @Order(1)
    public void testStringToNumbersAndSpacesHappyPath() {

        String excNumbAndSpaces = "      Abracadabra0  125487 -+*/   a";
        String expectedResult = "      0  125487    ";

        StringToNumbersAndSpaces excNumbAndSpacesObject = new StringToNumbersAndSpaces();
        String actualResult = excNumbAndSpacesObject.StringToNumbersAndSpaces(excNumbAndSpaces);

        Assertions.assertEquals(expectedResult, actualResult);


    }


}
