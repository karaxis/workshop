package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

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

    @Test
    public void onlyAllowValidURL(){
        
        // Arrange
        String invalidURL = "asdasdaljdas";

        //Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,() -> {new Bookmark(invalidURL);});
    }

/*    @Test
    public void ensureValidURL() throws MalformedURLException {

        String validURL = new Bookmark("https://www.youtube.at/").getURL();
        Boolean expectedResult = true;
        boolean result;
        try {
            new URL(validURL).toURI();
            result = true;
        }

        // If there was an Exception
        // while creating URL object
        catch (Exception e) {
            result = false;
        }

        assertEquals(expectedResult, result);

    }*/

    @Test
    public void keywordShorterThan3Char(){

        boolean expectedResult = false;
        //Act
        boolean result = new Bookmark("https://www.google.com/").checkIfKeywordLongerThan3Char("a");

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void keywordEqualTo3Char(){

        boolean expectedResult = false;
        //Act
        boolean result = new Bookmark("https://www.google.com/").checkIfKeywordLongerThan3Char("a2-");

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void keywordLongerThan3Char(){

        boolean expectedResult = true;
        //Act
        boolean result = new Bookmark("https://www.google.com/").checkIfKeywordLongerThan3Char("2-po7d");

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void keywordIsEmpty(){

        boolean expectedResult = false;
        //Act
        boolean result = new Bookmark("https://www.google.com/").checkIfKeywordLongerThan3Char("");

        //Assert
        assertEquals(expectedResult, result);
    }







}
