<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>LBLOG</title>
<link href="css/reset.css" rel="stylesheet">

<style>
	.topArea {
	  display: block;
	  margin: 0 auto;
	}
	.contents{
		float: right;
 		height: 200px;
		width: 750px;  
		margin-top: 30px;
		padding-bottom: 10px;
		border-bottom: 2px solid lightgrey;
	
	}

	.blogImg{ 		
			float: right;	
 			height: 200px;
			width: 200px; 
			margin-top: 30px;
			padding-left: 20px;
			margin-right: 150px;
			padding-bottom: 10px;
			border-bottom: 2px solid lightgrey;
			clear: both;
			
		}

	.title{
		font-size: 25px;
		padding-bottom: 15px;
		height: 30px;
	}	
	
	.summernote{
		margin-bottom: 40px;
		height: 100px;
		overflow: hidden;  	
  		text-overflow: ellipsis;  	
  		
		
	}
	.regdate{
		height: 10px;
		color: gray;
		
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
</style>		
</head>
<body>

</head>
<body>
	

	<%@include  file="../set/header.jsp" %>
    
	<div class="blogBody">

    	<c:forEach var="list" items="${viewAll}" begin="0" end="3">
		<div class="main">
			<img src="./img/blog.jpg" class="blogImg">
				<div class="contents">
			<a class="move" href='/get?bno=<c:out value="${list.bno}"/>'>
					<div class="title">
								<c:out value="${list.title}" />
					</div>
					<div class="summernote"><c:out value='${list.content.replaceAll("\\\<.*?\\\>","")}' escapeXml="true"/></div>
			</a>
					<span class="regdate"><fmt:formatDate value="${list.regdate }" pattern="yyyy.MM.dd"/></span>		
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

	<form id="moveForm" method="get">
	
	</form>
	
	
<script>	
	let moveForm = $("#moveForm");
 
    $(".move").on("click", function(e){
        e.preventDefault();
        moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
        moveForm.attr("action", "/get");
        moveForm.submit();
    });
	
    </script>	
	
</body>
</html>