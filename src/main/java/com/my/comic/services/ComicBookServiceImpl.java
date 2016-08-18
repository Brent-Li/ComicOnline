package com.my.comic.services;

import com.my.comic.exception.ServerException;
import com.my.comic.repository.ComicBookRepository;
import com.my.comic.resources.ComicBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Default implementation of ComicBookService.
 *
 * Created by Brent on 2016/8/11.
 */
@Service
public class ComicBookServiceImpl implements ComicBookService {
    @Autowired
    private ComicBookRepository comicBookRepository;
    @Override
    public List<ComicBook> getComicBookList(int pageSize, int currentPage) throws ServerException {
        return comicBookRepository.getComicBookList(pageSize, currentPage);
    }

    @Override
    public ComicBook getComicBook(long bid) throws ServerException {
        return comicBookRepository.getComicBook(bid);
    }
}
