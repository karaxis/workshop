package pt.ipp.isep.dei.examples.tdd.basic.domain;

import javax.swing.text.html.HTML;
import java.net.URL;

public class Bookmark {
    
    private String URLString;

    public Bookmark(String url) throws IllegalArgumentException{
        try{
            new URL(url).toURI();
        }
        catch(Exception e){
            throw new IllegalArgumentException();
        }

        URLString = url;
    }

    public String getURL() {
        return URLString;
    }


    public static boolean checkIfKeywordLongerThan3Char(String keyword){
        if (keyword.length() > 3) {
            return true;
        } else {
            return false;
        }
    }
}
