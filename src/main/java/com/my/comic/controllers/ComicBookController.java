package com.my.comic.controllers;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.ComicBook;
import com.my.comic.services.ComicBookService;
import com.my.comic.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Comic book controller.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
@RestController
public class ComicBookController {
    @Autowired
    private ComicBookService comicBookService;

    @RequestMapping(value = "/books", method = {RequestMethod.GET})
    public List<ComicBook> getCommicBookList(@RequestParam(value = "pageSize",
            defaultValue = Constants.DEFAULT_PAGE_SIZE_STRING_VALUE) int pageSize,
                                             @RequestParam(value = "currentPage",
                                                     defaultValue = Constants.DEFAULT_CURRENT_PAGE_STRING_VALUE) int currentPage) throws ServerException {
        return comicBookService.getComicBookList(pageSize, currentPage);
    }

    @RequestMapping(value = "/books/{bid}", method = {RequestMethod.GET})
    public ComicBook getComicBook(@PathVariable(value = "bid") long bid) throws ServerException {
        return comicBookService.getComicBook(bid);
    }
}
