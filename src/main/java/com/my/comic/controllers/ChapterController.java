package com.my.comic.controllers;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Chapter;
import com.my.comic.services.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Chapter controller.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
@RestController
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @RequestMapping(value = "/books/{bid}/chapters", method = {RequestMethod.GET})
    public List<Chapter> getChapterList(@PathVariable(value = "bid") long bid) throws ServerException {
        return chapterService.getChapterList(bid);
    }

    @RequestMapping(value = "/books/{bid}/chapters/{cid}", method = {RequestMethod.GET})
    public Chapter getChapter(@PathVariable(value = "bid") long bid, @PathVariable(value = "cid") long cid) throws ServerException {
        return chapterService.getChapter(bid, cid);
    }
}
