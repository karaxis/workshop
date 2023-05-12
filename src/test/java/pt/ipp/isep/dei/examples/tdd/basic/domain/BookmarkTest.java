package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class BookmarkTest {


    @Test
    public void ensureURLIsSet(){

        // Arrange
        String expectedResult = "https://www.google.com/";
        String result = "a";
        //Act
        result = new Bookmark("https://www.google.com/").getURL() ;

        //Assert
        assertEquals(expectedResult, result);
    }
}
