package com.my.comic.repository;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.ComicBook;

import java.util.List;

/**
 *
 * Created by Brent on 2016/8/11.
 */
public interface ComicBookRepository {
    /**
     * Get comic book list by page size and current page number.
     *
     * @param pageSize default is 50
     * @param currentPage current page number
     *
     * @return Comic book list.
     */
    List<ComicBook> getComicBookList(int pageSize, int currentPage) throws ServerException;

    /**
     * Get comic book by id.
     *
     * @param bid book id
     *
     * @return Comic book.
     */
    ComicBook getComicBook(long bid) throws ServerException;
}
