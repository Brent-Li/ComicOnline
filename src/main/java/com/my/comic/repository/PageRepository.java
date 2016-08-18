package com.my.comic.repository;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Page;

/**
 * Page repository.
 * <p/>
 * Created by Brent on 2016/8/11.
 */
public interface PageRepository {

    /**
     * Get page by id.
     *
     * @param bid book id
     * @param cid chapter id
     * @param pid page id
     * @return page.
     */
    Page getPage(long bid, long cid, long pid) throws ServerException;
}
