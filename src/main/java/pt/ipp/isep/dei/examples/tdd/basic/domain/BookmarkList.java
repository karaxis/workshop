package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.util.ArrayList;

public class BookmarkList {

    public ArrayList<Bookmark> _bookmarklist;
    
    public BookmarkList(){
        _bookmarklist = new ArrayList<Bookmark>();
    }

    public void addBookMark(Bookmark bm){
        _bookmarklist.add(bm);
    }
}
