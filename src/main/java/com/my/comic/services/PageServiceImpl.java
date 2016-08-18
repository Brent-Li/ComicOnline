package com.my.comic.services;

import com.my.comic.exception.ServerException;
import com.my.comic.repository.PageRepository;
import com.my.comic.resources.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Page service implementation.
 * <p/>
 * Created by Brent on 2016/8/12.
 */
@Service
public class PageServiceImpl implements PageService {
    @Autowired
    private PageRepository pageRepository;


    @Override
    public Page getPage(long bid, long cid, long pid) throws ServerException {
        return pageRepository.getPage(bid, cid, pid);
    }
}
