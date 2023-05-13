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


    public static boolean checkIfKeywordLongerThan3Char(String keyword){
        if (keyword.length() > 3) {
            return true;
        } else {
            return false;
        }
    }

    public void increaseRating(){
        this.rating++;
    }

    @Override
    public boolean equals(Object object) {
    Bookmark anotherBookmark= (Bookmark) object;
    if(this.URLString.equals(anotherBookmark.URLString)) return true;
    return false;
    }
}
