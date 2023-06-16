package com.haru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haru.mapper.BoardListMapper;
import com.haru.model.BoardListVO;
import com.haru.model.Criteria;

@Service
public class BoardListServiceImpl implements BoardListService{
	
	@Autowired
	BoardListMapper mapper;
	

	
	/* 게시물 등록 */
	@Override
	public void writing(BoardListVO vo) throws Exception{
		mapper.writing(vo);
	
	}
	
	/* 게시물 수정 */
	@Override
	public int update(BoardListVO vo) throws Exception {
		
		return mapper.update(vo);
		
	}
	
	/* 게시물 삭제 */
	@Override
	public void delete(BoardListVO vo) throws Exception {
		
		mapper.delete(vo);
		
	}

	/* 게시물 전체 조회 */
	@Override
	public List<BoardListVO> viewAll(BoardListVO vo) throws Exception {
		
		return mapper.viewAll(vo);
	}

	/* 카테고리별 게시물 조회 */
	@Override
	public List<BoardListVO> getList(String category) throws Exception {
		
		return mapper.getList(category);
	}

	/* 게시물 상세 조회 */
	@Override
	public BoardListVO getPage(int bno) throws Exception {
		
		return mapper.getPage(bno);
	}

	/* 게시판 목록(페이징 적용) */
	@Override
	public List<BoardListVO> getListPaging(Criteria cri) throws Exception {
		
		return mapper.getListPaging(cri);
	}

	/* 게시물 총 갯수 */
	@Override
	public int getTotal(String category) throws Exception {
		
		return mapper.getTotal(category);
	}

	/* 게시물 검색 조회 */
	@Override
	public List<BoardListVO> search(String keyword) throws Exception {
		
		
		
		return mapper.search(keyword);
	}
	/* 댓글 갯수 조회 */
	@Override
	public int getReplyCount(int bno) throws Exception {
		 return mapper.getReplyCount(bno);
	}



	

	


	









	
	
}
