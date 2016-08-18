package com.my.comic.services;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.ComicBook;

import java.util.List;

/**
 * Comic book service.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
public interface ComicBookService {

    /**
     * Get comic book list by page size and current page number.
     *
     * @param pageSize    default is 50
     * @param currentPage current page number
     * @return
     */
    List<ComicBook> getComicBookList(int pageSize, int currentPage) throws ServerException;

    /**
     * Get comic book by id.
     *
     * @param bid
     * @return
     */
    ComicBook getComicBook(long bid) throws ServerException;

}
