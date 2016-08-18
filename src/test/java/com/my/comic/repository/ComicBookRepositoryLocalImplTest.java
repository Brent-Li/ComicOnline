package com.my.comic.repository;

import com.my.comic.resources.ComicBook;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Test class of ComicBookRepositoryLocalImpl.
 *
 * Created by Brent on 2016/8/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComicBookRepositoryLocalImpl.class)
public class ComicBookRepositoryLocalImplTest extends TestCase {
    @Autowired
    private ComicBookRepositoryLocalImpl comicBookRepositoryLocal;

    @Test
    public void testGetComicBookList() throws Exception {
        List<ComicBook> actual = comicBookRepositoryLocal.getComicBookList(1, 1);
        assertEquals(2, actual.size());
        ComicBook comicBook = actual.get(0);
        assertEquals("One Piece", comicBook.getBookName());
        actual = comicBookRepositoryLocal.getComicBookList(2, 1);
        comicBook = actual.get(1);
        assertEquals("One-Punch Man", comicBook.getBookName());
    }

    public void testGetComicBook() throws Exception {
        ComicBook comicBook = comicBookRepositoryLocal.getComicBook(1);
        assertEquals("One Piece", comicBook.getBookName());
        comicBook = comicBookRepositoryLocal.getComicBook(2);
        assertEquals("One-Punch Man", comicBook.getBookName());
    }
}