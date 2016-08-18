package com.my.comic.services;

import com.my.comic.exception.ServerException;
import com.my.comic.repository.ChapterRepository;
import com.my.comic.resources.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Chapter service implementation.
 * <p/>
 * Created by Brent on 2016/8/12.
 */
@Service
public class ChapterServiceImpl implements ChapterService {
    @Autowired
    private ChapterRepository chapterRepository;

    @Override
    public List<Chapter> getChapterList(long bid) throws ServerException {
        return chapterRepository.getChapterList(bid);
    }

    @Override
    public Chapter getChapter(long bid, long cid) throws ServerException {
        return chapterRepository.getChapter(bid, cid);
    }
}
