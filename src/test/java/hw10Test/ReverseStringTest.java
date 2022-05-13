package hw10Test;

import hw10.ReverseString;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseStringTest {

    @Test()
    @Order(1)

    public void testReverseStringHappyPath() {

        String palindrome = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString stringObject = new ReverseString();
        String actualResult = stringObject.ReverseString(palindrome);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(2)

    public void testReverseStringSatorHappyPath() {

        String palindrome = "SATOR AREPO TENET OPERA ROTAS";
        String expectedResult = "SATOR AREPO TENET OPERA ROTAS";

        ReverseString stringObject = new ReverseString();
        String actualResult = stringObject.ReverseString(palindrome);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(3)

    public void testReverseStringRusHappyPath() {

        String palindrome = "НАЖАЛ КАБАН НА БАКЛАЖАН";
        String expectedResult = "НАЖАЛКАБ АН НАБАК ЛАЖАН";

        ReverseString stringObject = new ReverseString();
        String actualResult = stringObject.ReverseString(palindrome);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(4)

    public void testReverseStringSimbolsHappyPath() {

        String palindrome = "ʕ ᵔᴥᵔ ʔ";
        String expectedResult = "ʔ ᵔᴥᵔ ʕ";

        ReverseString stringObject = new ReverseString();
        String actualResult = stringObject.ReverseString(palindrome);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

