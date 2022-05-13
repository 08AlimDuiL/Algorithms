package hw10Test;

import hw10.RemoveDuplicates;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class RemoveDuplicatesTest {

    @Test()
    @Order(1)

    public void testRemoveDuplicatesHappyPath() {

        String uniqueLetters = "AABBCCaabbcc";
        String expectedResult = "abc";


        RemoveDuplicates uniqueObject = new RemoveDuplicates();
        String actualResult = uniqueObject.RemoveDuplicates(uniqueLetters);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(2)

    public void testRemoveDuplicatesWithOutSimbolsHappyPath() {

        String uniqueLetters = "AA{!@#$%^&*()_+  /*-+0123456789`~{//";
        String expectedResult = "a";


        RemoveDuplicates uniqueObject = new RemoveDuplicates();
        String actualResult = uniqueObject.RemoveDuplicates(uniqueLetters);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}







