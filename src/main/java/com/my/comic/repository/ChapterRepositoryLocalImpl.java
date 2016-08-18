package com.my.comic.repository;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Chapter;
import com.my.comic.resources.ComicBook;
import com.my.comic.utils.Constants;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Default implementation of ChapterRepository. Get data from local storage.
 * <p/>
 * Created by Brent on 2016/8/12.
 */
@Repository
public class ChapterRepositoryLocalImpl implements ChapterRepository {
    @Override
    public List<Chapter> getChapterList(long bid) throws ServerException {
        File file = new File(Constants.ROOT_PATH + bid + ".properties");
        Properties properties = new Properties();
        List<Chapter> ret = new ArrayList<>();
        try {
            properties.load(new FileInputStream(file));
            long latestCid = Long.parseLong(properties.getProperty(Constants.KEY_CHAPTER_LATEST));
            for (int i = 1; i < latestCid + 1; i++) {
                Chapter chapter = readFromFile(properties, i);
                ret.add(chapter);
            }
        } catch (FileNotFoundException fe) {
            throw new ServerException();
        } catch (IOException ie) {
            throw new ServerException();
        }
        return ret;
    }

    @Override
    public Chapter getChapter(long bid, long cid) throws ServerException {
        File file = new File(Constants.ROOT_PATH + bid + ".properties");
        Properties properties = new Properties();
        Chapter chapter;
        try {
            properties.load(new FileInputStream(file));
            chapter = readFromFile(properties, cid);
        } catch (FileNotFoundException fe) {
            throw new ServerException();
        } catch (IOException ie) {
            throw new ServerException();
        }
        return chapter;
    }

    private Chapter readFromFile(Properties properties, long cid) throws ServerException {
        Chapter chapter = new Chapter();
        chapter.setId(cid);
        chapter.setChapterName(properties.getProperty(String.format(Constants.KEY_CHAPTER_NAME, cid)));
        chapter.setChapterDescription(properties.getProperty(String.format(Constants.KEY_CHAPTER_DESCRIPTION, cid)));
        chapter.setChapterPages(properties.getProperty(String.format(Constants.KEY_CHAPTER_PAGES, cid)));
        return chapter;
    }
}
