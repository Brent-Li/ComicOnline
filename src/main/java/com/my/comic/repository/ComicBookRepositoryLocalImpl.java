package com.my.comic.repository;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.ComicBook;
import com.my.comic.utils.Constants;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Default implementation of ComicBookRepository. Get data from local storage.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
@Repository
public class ComicBookRepositoryLocalImpl implements ComicBookRepository {

    @Override
    // TODO: pagination
    public List<ComicBook> getComicBookList(int pageSize, int currentPage) throws ServerException {
        File file = new File(Constants.ROOT_PATH);
        List<ComicBook> ret = new ArrayList<>();
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (null == files || 0 == files.length)
                throw new ServerException();
            for (File f : files) {
                ComicBook comicBook = readFromFile(f);
                ret.add(comicBook);
            }
        }
        return ret;
    }

    @Override
    public ComicBook getComicBook(long bid) throws ServerException {
        File file = new File(Constants.ROOT_PATH + bid + ".properties");
        return readFromFile(file);
    }

    private ComicBook readFromFile(File f) throws ServerException {
        ComicBook comicBook = new ComicBook();
        comicBook.setId(Long.parseLong(f.getName().split("\\.properties")[0]));
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(f));
            comicBook.setBookAuthor(properties.getProperty(Constants.KEY_BOOK_AUTHOR));
            comicBook.setBookCategory(properties.getProperty(Constants.KEY_BOOK_CATEGORY));
            comicBook.setBookDescription(properties.getProperty(Constants.KEY_BOOK_DESCRIPTION));
            comicBook.setBookLastUpdateTime(properties.getProperty(Constants.KEY_BOOK_LAST_UPDATE_TIME));
            comicBook.setBookName(properties.getProperty(Constants.KEY_BOOK_NAME));
            comicBook.setBookStatus(properties.getProperty(Constants.KEY_BOOK_STATUS));
        } catch (FileNotFoundException fe) {
            throw new ServerException();
        } catch (IOException ie) {
            throw new ServerException();
        }
        return comicBook;
    }
}
