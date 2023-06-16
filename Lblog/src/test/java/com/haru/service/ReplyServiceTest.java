package com.haru.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.haru.model.BoardListVO;
import com.haru.model.ReplyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyServiceTest {

	  @Autowired
	    private ReplyService service;
	  
	  @Autowired
	    private BoardListService boardListService;

//	    @Test
//	    public void testReplyList() {
//	        int bno = 365;
//
//	        try {
//	            List<ReplyVO> replyList = service.replyList(bno);
//
//	            // 테스트 결과에 대한 검증 로직을 작성합니다.
//	            // 예를 들어, replyList의 사이즈가 예상한 값과 일치하는지 검사할 수 있습니다.
//	            int expectedSize = 1;
//	            int actualSize = replyList.size();
//	            assert actualSize == expectedSize : "Expected size: " + expectedSize + ", Actual size: " + actualSize + ", Reply list: " + replyList;
//
//	            // 또는, replyList에서 원하는 댓글의 속성을 확인할 수 있습니다.
//	            String expectedAuthor = "작성자3";
//	            ReplyVO firstReply = replyList.get(0);
//	            String actualAuthor = firstReply.getAuthor();
//	            assert actualAuthor.equals(expectedAuthor) : "Expected author: " + expectedAuthor + ", Actual author: " + actualAuthor + ", Reply list: " + replyList;
//
//	            // 추가적인 검증 로직을 작성할 수 있습니다.
//
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }
	        
//	  @Test
//	  public void testSaveReply()throws Exception{
//		  
//		  ReplyVO vo = new ReplyVO();
//		  vo.setBno(365);
//		  vo.setComment("댓글내용");
//		  vo.setAuthor("kim@naver.com");
//		  
//		  service.saveReply(vo);
//		  
//	  }
	  
//	  @Test
//	    public void testUpdateReplyCount() throws Exception {
//		  BoardListVO board = new BoardListVO();
//		  
//		    board.setTitle("테스트 게시글");
//		    board.setContent("테스트 게시글 내용");
//		    board.setWriter("kim2@naver.com");
//		    board.setCategory("cafe");
//		    boardListService.writing(board);
//
//	        ReplyVO reply1 = new ReplyVO();
//	        reply1.setBno(365);
//	        reply1.setAuthor("kim@naver.com");
//	        reply1.setComment("테스트");
//	        service.saveReply(reply1);
//
//	        ReplyVO reply2 = new ReplyVO();
//	        reply2.setBno(365);
//	        reply2.setAuthor("kim@naver.com");
//	        reply2.setComment("테스트2");
//	        service.saveReply(reply2);
//
//	        // 댓글 수 업데이트 테스트
//	        service.updateReplyCnt(365);
//
//	        // 게시글 조회
//	        BoardListVO resultBoard = boardListService.getPage(365);
//
//	        // 댓글 수 확인
//	        int replyCount = resultBoard.getReply_cnt();
//	        assertEquals(2, replyCount);
//	    }
	    }
	

