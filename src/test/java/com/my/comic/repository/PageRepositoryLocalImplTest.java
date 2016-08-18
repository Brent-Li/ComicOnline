package com.my.comic.repository;

import com.my.comic.resources.Page;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test class of PageRepositoryLocalImpl.
 * Created by Brent on 2016/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PageRepositoryLocalImpl.class)
public class PageRepositoryLocalImplTest extends TestCase {
    @Autowired
    private PageRepositoryLocalImpl pageRepositoryLocal;

    @Test
    public void testGetPage() throws Exception {
        Page actual = pageRepositoryLocal.getPage(2, 4, 5);
        assertEquals("www.amazon.com/s3/image/page/2-4-5.jpg", actual.getLink());
    }
}