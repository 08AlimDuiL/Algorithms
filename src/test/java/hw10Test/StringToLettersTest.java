package hw10Test;

import hw10.StringToLetters;
import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersTest {

    @Test()
    @Order(1)
    public void testStringToLettersHappyPath() {

        String deleteAllExceptTheLetters = "    Abracadabra0125487 -+*/   arbadacarbA   ";
        String expectedResult = "AbracadabraarbadacarbA";

        StringToLetters exceptTheLettersObject = new StringToLetters();
        String actualResult = exceptTheLettersObject.StringToLetters(deleteAllExceptTheLetters);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()  // " ????? and \   ????
    @Order(2)
    public void testStringToLettersWithSpeсialHappyPath() {

        String deleteAllExceptTheLetters = " !№;%:?*()_+~`!@''''''#$%^&{}[]:;/.,|Abracadabra";
        String expectedResult = "Abracadabra";

        StringToLetters exceptTheLettersObject = new StringToLetters();
        String actualResult = exceptTheLettersObject.StringToLetters(deleteAllExceptTheLetters);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
