package com.my.comic.resources;

/**
 * Chapter resources.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
public class Chapter {

    private long id;
    private String chapterName;
    private String chapterDescription;
    private String chapterPages;

    public long getId() {
        return id;
    }

    public String getChapterName() {
        return chapterName;
    }

    public String getChapterDescription() {
        return chapterDescription;
    }

    public String getChapterPages() {
        return chapterPages;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public void setChapterDescription(String chapterDescription) {
        this.chapterDescription = chapterDescription;
    }

    public void setChapterPages(String chapterPages) {
        this.chapterPages = chapterPages;
    }
}
