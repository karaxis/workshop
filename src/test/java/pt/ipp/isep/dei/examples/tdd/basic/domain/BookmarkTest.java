package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

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

    @Test
    public void createBookmarkList(){

        // Arrange
        ArrayList<Bookmark> expectedResult = new BookmarkList()._bookmarklist;
        ArrayList<Bookmark> result = null;

        // Act
        result = new BookmarkList()._bookmarklist;

        // Assert
        assertEquals(expectedResult,result);
    }

    @Test
    public void addBookmarkToList(){
        
    }
}
