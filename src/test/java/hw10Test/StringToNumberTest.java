package hw10Test;

import hw10.StringToNumber;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumberTest {

    @RepeatedTest(5)
    @Order(1)
    public void StringToNumberTestHappyPath() {

        String delAllExcNumbers = "   Abr  acadabra0123456789 -+*/";
        String expectedResult = "0123456789";

        StringToNumber delAllExcNumbersObject = new StringToNumber();
        String actualResult = delAllExcNumbersObject.StringToNumber(delAllExcNumbers);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}


