package com.haru.service;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.haru.model.BoardListVO;
import com.haru.model.Criteria;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardListSerivceTest {
	
	private static final Logger log = LoggerFactory.getLogger(BoardListSerivceTest.class);
	
	
	@Autowired
	    private BoardListService service;
	    
		/*
		 * @Test public void testEnroll() throws Exception{
		 * 
		 * BoardListVO vo = new BoardListVO();
		 * 
		 * vo.setTitle("service test"); vo.setContent("service test");
		 * vo.setWriter("service test"); vo.setCategory("service test");
		  
		   service.writing(vo);
		 
		  }
		 */
	    
		/*
		   @Test public void testViewAll()throws Exception{
		  
		   BoardListVO vo = new BoardListVO();
		  
		  
		   service.viewAll(vo); }
		 */
	
		/*
		   @Test public void testGetPage() throws Exception{
		  
		   String title = "cafe";
		   
		   log.info("" + service.getPage(title)); }
		 */
			
	
			/* 게시판 카테고리별 목록(페이징 적용) 테스트 */
			@Test
			public void testGetPaging() throws Exception {
				
				Criteria cri = new Criteria();
				cri.setPageNum(1);
		        cri.setAmount(10);
		        cri.setCategory("cafe");
				
		        List<BoardListVO> list = service.getListPaging(cri);
			
				list.forEach(boardlist -> log.info("" + boardlist));
			}
}
