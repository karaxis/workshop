package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.URL;

public class Bookmark {
    
    private String URLString;

    public int rating;

    public Bookmark(String url) throws IllegalArgumentException{
        try{
            new URL(url).toURI();
        }
        catch(Exception e){
            throw new IllegalArgumentException();
        }
        
        rating = 0;
        URLString = url;
    }
    public String getURL() {
        return URLString;
    }
}
