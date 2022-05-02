package hw9Test;

import hw9.PeakElement;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {


    @RepeatedTest(5)
    public void testPeakElementHappyPath(){

        int[] arrayInt = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement PeakElementObject = new PeakElement();
        int[] actualResult = PeakElementObject.PeakElement(arrayInt);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
