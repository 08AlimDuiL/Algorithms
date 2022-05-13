package hw10Test;

import hw10.CountWords;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CountWordsTest {

    @RepeatedTest(2)
    @Order(1)

    public void testCountWordsHappyPath() {

        String text = "As of March 2022, Java 18 is the latest version, while" +
                " Java 17, 11 and 8 are the current long-term support (LTS) " +
                "versions. Oracle released the last zero-cost public update for " +
                "the legacy version Java 8 LTS in January 2019 for commercial" +
                " java use, although it will otherwise still support Java 8 with" +
                " public updates for personal use indefinitely. Other vendors" +
                " have begun to offer zero-cost builds of OpenJDK 8 and 11 that " +
                "are still receiving security and other upgrades.";
        String word = "Java";
        int expectedResult = 5;

        CountWords countObject = new CountWords();
        int actualResult = countObject.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(2)
    public void testCountWordsTwoHappyPath() {

        String text = "As of March 2022, Java 18 is the latest version, while " +
                "Java 17, 11 and 8 are the current long-term support (LTS)" +
                " versions. Oracle released the last zero-cost public update " +
                "for the legacy version Java 8 LTS in January 2019 for" +
                " commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use " +
                "indefinitely. Other vendors have begun to offer zero-cost" +
                " builds of OpenJDK 8 and 11 that are still receiving security " +
                "and other upgrades.";
        String word = "version";
        int expectedResult = 2;

        CountWords countObject = new CountWords();
        int actualResult = countObject.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(3)
    public void testCountWordsNullHappyPath() {

        String text = "As of March 2022, Java 18 is the latest version, while " +
                "Java 17, 11 and 8 are the current long-term support (LTS)" +
                " versions.";
        String word = "";
        int expectedResult = -1;

        CountWords countObject = new CountWords();
        int actualResult = countObject.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(4)
    public void testCountWordsNumbersHappyPath() {

        String text = "As of March 2022, Java 18 is the latest version, while9 " +
                "Java 17, 11 and 8 are the current long-term support (LTS)" +
                " versions. while, 1while";
        String word = "while";
        int expectedResult = 1;

        CountWords countObject = new CountWords();
        int actualResult = countObject.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test()
    @Order(5)
    public void testCountWordHappyPath() {

        String text = "As of March 2022, Java 18 is the latest version, while " +
                "Java 17, 11 and 8 are the current long-term support (LTS)" +
                " versions.";
        String word = "While";
        int expectedResult = 1;

        CountWords countObject = new CountWords();
        int actualResult = countObject.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}





