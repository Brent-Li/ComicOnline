package com.my.comic.services;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Chapter;

import java.util.List;

/**
 * Chapter service.
 * <p/>
 * Created by Brent on 2016/8/12.
 */
public interface ChapterService {

    /**
     * Get chapter list for book.
     *
     * @param bid book id.
     * @return
     */
    List<Chapter> getChapterList(long bid) throws ServerException;

    /**
     * Get chapter information.
     *
     * @param bid book id.
     * @param cid chapter id.
     * @return
     */
    Chapter getChapter(long bid, long cid) throws ServerException;

}
