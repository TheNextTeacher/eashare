package com.jiaming.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jiaming.entity.Book;
import com.jiaming.util.BaseTest;

public class BookDaoTest extends BaseTest {

	  @Autowired
	    private BookDao bookDao;

	    @Test
	    public void testQueryById() throws Exception {
	        long bookId = 1000;
	        Book book = bookDao.queryById(bookId);
	        System.out.println(book);
	    }

}
