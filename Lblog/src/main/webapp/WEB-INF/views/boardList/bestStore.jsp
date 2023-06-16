<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맛집</title>
<style>
	.topArea {
	  display: none;
	}

	#bestStore_link a {
		  color: #90caf9;
	}
	.bestStore_cnt{
		margin-top: 70px;
		margin-left: 50px;
		margin-bottom: -30px;
		padding-left: 50px;
		font-weight: bold;	
	}
	.total_cnt{
	 color: #90caf9; 
	 margin-left:5px;
	}
	.post{
		float: left;
		width: 200px;
		height:400px; 
		margin-top: 90px;
		margin-left: 10px;
		padding-left: 85px;
	}	
	.thumnail_img{
		width: 190px;
		height: 190px;
	}	
	.thumnail{
		height: 200px;
	}
	.title{
		height: 40px;
	}
	.summernote{
		height: 100px;
		overflow: hidden;  	
  		text-overflow: ellipsis; 
  		margin-bottom: 10px;
	}
	.under{
		height: 30px;
	}
	.pageInfo_wrap{
		clear: both;
	}
	.pageInfo {
	  list-style: none;
	  display: flex;
	  justify-content: center;
	  margin-top: 50px;
	}
	.pageInfo li {
	  font-size: 20px;
	  margin-left: 18px;
	  padding: 7px;
	  font-weight: 500;
	}
	.write_btn{
	margin-right: 120px;
	clear: both;
	text-decoration: none;
	float: right;
	margin-top:10px;
	border-bottom: 1px solid;
	margin-bottom: 10px;
    }
	.active{
    background-color: #cdd5ec;
   }
      .speech_bubble{
    	height: 15px;
    	width: 15px;
    	margin-right: 5px;
    }
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>    
</head>

<body>
	<div class="conteiner">
	<%@include  file="../set/header.jsp" %>
	<div class="bestStore_cnt">맛집<span class="total_cnt">${pageMaker.total }</span></div>
	<c:forEach var="list" items="${list}">
	<div class="post">
		<a class="move" href='/get?bno=<c:out value="${list.bno}"/>'>
			<div class="thumnail"><img class="thumnail_img" src="./img/blog.jpg"></div>
			<div class="contents">	
				<div class="title"><c:out value="${list.title}" /></div>
				<div class="summernote"><c:out value='${list.content.replaceAll("\\\<.*?\\\>","")}' escapeXml="true"/></div>
		</a>	
				<div class="under">
				<span class="regdate"><fmt:formatDate value="${list.regdate }" pattern="yyyy.MM.dd"/></span>
				<span class="num_cnt"><img class="speech_bubble" src="./img/speech_bubble.png"><c:out value="${list.replyCnt}"/></span>
				</div>
			</div>	
		</div>	
    	</c:forEach>
    	<c:if test="${not empty sessionScope.memId}">
		    <div class="write_btn">
		    	<i class="fas fa-solid fa-pen"></i>
		        <a href="/writing">글쓰기</a>
		    </div>
		 </c:if>
		  <c:if test="${empty sessionScope.memId}">
		    <div class="write_btn">
		    	<i class="fas fa-solid fa-pen"></i>
		        <a href="/members/login">글쓰기</a>
		    </div>
		  </c:if>  
	</div>
	   <div class="pageInfo_wrap" >
        <div class="pageInfo_area">
        <ul id="pageInfo" class="pageInfo">
         	<!-- 이전페이지 버튼 -->
	         <c:if test="${pageMaker.prev}">
	             <li class="pageInfo_btn previous"><a href="${pageMaker.startPage-1}">&lt;</a></li>
	         </c:if>
    		<!-- 각 번호 페이지 버튼 -->
			<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
			  <li class="pageInfo_btn ${pageMaker.cri.pageNum == num ? "active":"" }">
			    <a href="${num}">${num}</a> 
			  </li>
			</c:forEach>
			<!-- 다음페이지 버튼 -->
              <c:if test="${pageMaker.next}">
                  <li class="pageInfo_btn next"><a href="${pageMaker.endPage + 1 }">&gt;</a></li>
              </c:if> 
		</ul>   
        </div>
    </div>
    
    
    	
	<form id="moveForm1" method="get">
		<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
		<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
	</form>
	
	
	
<script>	
	let moveForm = $("#moveForm1");
 
    $(".move").on("click", function(e){
        e.preventDefault();
        moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
        moveForm.attr("action", "/get");
        moveForm.submit();
    });
    
    $(".pageInfo a").on("click", function(e){
    	  e.preventDefault();
    	  var pageNum = $(this).attr("href");
    	  var category = "${param.c}"; // 현재 카테고리 파라미터 값 가져오기
    	  var url = "/bestStore?c=" + category + "&pageNum=" + pageNum; // 카테고리 파라미터와 페이지 번호를 포함한 URL 구성
    	  window.location.href = url;
    	});
	
    </script>	
	
	
</body>
</html>