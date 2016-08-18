package com.my.comic.repository;

import com.my.comic.resources.Chapter;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Test class of ChapterRepositoryLocalImpl.
 * Created by Brent on 2016/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ChapterRepositoryLocalImpl.class)
public class ChapterRepositoryLocalImplTest extends TestCase {
    @Autowired
    private ChapterRepositoryLocalImpl chapterRepositoryLocal;

    @Test
    public void testGetChapterList() throws Exception {
        List<Chapter> actual = chapterRepositoryLocal.getChapterList(1);
        assertEquals(10, actual.size());
    }

    @Test
    public void testGetChapter() throws Exception {
        Chapter actual = chapterRepositoryLocal.getChapter(1, 2);
        assertEquals("chapter 2", actual.getChapterName());
    }
}