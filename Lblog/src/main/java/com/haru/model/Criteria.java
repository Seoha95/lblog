package com.haru.model;

public class Criteria {

	
	/* 현재 페이지 */
	private int pageNum;
	
	/* 한 페이지 당 보여줄 게시물 갯수 */
	private int amount;
	
	private int skip;
	
	/* 카테고리 */
    private String category;
	
	/* 기본생성자 => 기본 세팅 : pageNum = 1, amount = 8 */
	public Criteria() {
		this(1,8);
		this.skip = 0;
	}
	
	/* 생성자 => 원하는 pageNum, 원하는 amount */
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.skip = (pageNum-1)*amount;
		
	}
	
	public int getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(int pageNum) {
		
		this.pageNum = pageNum;
		this.skip = (pageNum-1)*this.amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		
		this.amount = amount;
		this.skip = (this.pageNum-1)*amount;
	}

	public int getSkip() {
		return skip;
	}

	public void setSkip(int skip) {
		this.skip = skip;
	}
	
	 public String getCategory() {
	        return category;
	    }
	    
	   public void setCategory(String category) {
	        this.category = category;
	    }

	   @Override
	    public String toString() {
	        return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", skip=" + skip + ", category=" + category + "]";
	    }


	
	
}
