package com.my.comic.utils;

/**
 * Created by Brent on 2016/8/11.
 */
public interface Constants {
    public static final int DEFAULT_PAGE_SIZE = 50;
    public static final int DEFAULT_CURRENT_PAGE = 1;
    public static final String DEFAULT_PAGE_SIZE_STRING_VALUE = DEFAULT_PAGE_SIZE + "";
    public static final String DEFAULT_CURRENT_PAGE_STRING_VALUE = DEFAULT_CURRENT_PAGE + "";

    public static final String ROOT_PATH = "target/classes/books/";

    public static final String KEY_BOOK_NAME = "book.name";
    public static final String KEY_BOOK_AUTHOR = "book.author";
    public static final String KEY_BOOK_DESCRIPTION = "book.description";
    public static final String KEY_BOOK_CATEGORY = "book.category";
    public static final String KEY_BOOK_STATUS = "book.status";
    public static final String KEY_BOOK_LAST_UPDATE_TIME = "book.last.update.time";

    public static final String KEY_CHAPTER_LATEST = "book.chapter.latest";
    public static final String KEY_CHAPTER_NAME = "book.chapter.%d.name";
    public static final String KEY_CHAPTER_DESCRIPTION = "book.chapter.%d.description";
    public static final String KEY_CHAPTER_PAGES = "book.chapter.%d.pages";

    public static final String AMAZON_S3_URL = "www.amazon.com/s3/image/page/";
}
