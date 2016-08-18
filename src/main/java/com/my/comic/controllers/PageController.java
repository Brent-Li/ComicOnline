package com.my.comic.controllers;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Page;
import com.my.comic.services.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Page controller.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
@RestController
public class PageController {
    @Autowired
    private PageService pageService;

    @RequestMapping(value = "/books/{bid}/chapters/{cid}/pages/{pid}", method = {RequestMethod.GET})
    public Page getPage(@PathVariable(value = "bid") long bid, @PathVariable(value = "cid") long cid,
                        @PathVariable(value = "pid") long pid) throws ServerException {
        return pageService.getPage(bid, cid, pid);
    }
}
