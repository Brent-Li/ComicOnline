package com.my.comic.resources;

/**
 * Comic book resources.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
public class ComicBook {

    private long id;
    private String bookName;
    private String bookDescription;
    private String bookAuthor;
    private String bookStatus;
    private String bookCategory;
    private String bookLastUpdateTime;

    public long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookLastUpdateTime() {
        return bookLastUpdateTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setBookLastUpdateTime(String bookLastUpdateTime) {
        this.bookLastUpdateTime = bookLastUpdateTime;
    }
}
