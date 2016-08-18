package com.my.comic.services;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Page;

/**
 * Page service.
 * <p/>
 * Created by Brent on 2016/8/12.
 */
public interface PageService {

    /**
     * Get page information.
     *
     * @param bid book id.
     * @param cid chapter id.
     * @param pid page id.
     * @return
     */
    Page getPage(long bid, long cid, long pid) throws ServerException;

}
