package hw9Test;

import hw9.OddIndices;
import org.junit.jupiter.api.*;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPathArrayOfOddIndexes() {
        int[] differentInt = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};// Arrange

        OddIndices OddIndicesObject = new OddIndices();
        int[] actualResult = OddIndicesObject.OddIndices(differentInt);// Act

        Assertions.assertArrayEquals(expectedResult, actualResult);//Assert
    }
}
