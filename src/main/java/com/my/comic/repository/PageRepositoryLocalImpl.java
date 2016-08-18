package com.my.comic.repository;

import com.my.comic.exception.ServerException;
import com.my.comic.resources.Page;
import com.my.comic.utils.Constants;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Page repository implementation. Get data from local storage.
 * <p/>
 * Created by Brent on 2016/8/12.
 */
@Repository
public class PageRepositoryLocalImpl implements PageRepository {
    @Override
    public Page getPage(long bid, long cid, long pid) throws ServerException {
        File file = new File(Constants.ROOT_PATH + bid + ".properties");
        Properties properties = new Properties();
        Page page;
        try {
            properties.load(new FileInputStream(file));
            page = new Page();
            page.setId(pid);
            page.setLink(Constants.AMAZON_S3_URL + bid + "-" + cid + "-" + pid + ".jpg");
        } catch (FileNotFoundException fe) {
            throw new ServerException();
        } catch (IOException ie) {
            throw new ServerException();
        }
        return page;
    }
}
