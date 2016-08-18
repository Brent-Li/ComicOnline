package com.my.comic.repository;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Chapter;

import java.util.List;

/**
 * Chapter repository.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
public interface ChapterRepository {

    /**
     * Get chapter list by book id.
     *
     * @param bid book id
     * @return chapter list.
     */
    List<Chapter> getChapterList(long bid) throws ServerException;

    /**
     * Get chapter by id.
     *
     * @param bid book id
     * @param cid chapter id
     * @return chapter.
     */
    Chapter getChapter(long bid, long cid) throws ServerException;
}
