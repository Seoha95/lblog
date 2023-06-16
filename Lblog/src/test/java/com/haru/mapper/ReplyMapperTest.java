package com.haru.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.haru.model.ReplyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyMapperTest {

    private static final Logger log = LoggerFactory.getLogger(ReplyMapperTest.class);
    
    @Autowired
    private ReplyMapper mapper; 
	/*
	 * @Test public void testReplySave() throws Exception{
	 * 
	 * ReplyVO reply = new ReplyVO();
	 * 
	 * 
	 * reply.setBno(4); reply.setComment("mapper테스트"); reply.setAuthor("mapper테스트");
	 * 
	 * mapper.saveReply(reply);
	 * 
	 * }
	 */
    
    
    @Test
    public void testUpdateReply()throws Exception{
    	
    	
    }
}


