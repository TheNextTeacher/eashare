package com.jiaming.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jiaming.entity.Idea;
import com.jiaming.util.BaseTest;

public class IdeaDaoTest extends BaseTest{

	@Autowired 
	private IdeaDao ideaDao;
	@Test
	public void testQuery() {
		String ideaID = "201803200001";
		Idea idea =  ideaDao.queryIdeaByID(ideaID);
		System.out.println(idea.getIdeaName());
		
	}

}
