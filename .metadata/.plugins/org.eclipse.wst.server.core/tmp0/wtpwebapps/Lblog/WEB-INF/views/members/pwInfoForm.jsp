<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
		*{
		font-family: 'Noto Sans KR', sans-serif;
	}
	.container{
		text-align: center;
		margin:auto;
		margin-top: 225px;
		width: 420px;
		height: 200px;
		border: 2px solid #90caf9; 
		border-radius: 50px;
	}
	
	.title{
		color: #90caf9;
		font-size: 20px;	
		font-weight:bold;
		padding-top: 30px;
		margin-bottom: 30px;
	}
	
		a{
		text-decoration: none;
		padding:5px;
		width: 250px;
		height: 40px;
		border-radius: 20px;
		font-size: 20px;
		font-weight:bold;
		border:none;
		background-color: #90caf9;
		color: white;
		
	}
	
	.links{
		padding-top: 10px;
	}
	
	.false, .true{
		color: gray;
	}
	
	
	
</style>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="title">비밀번호 찾기</div>
		<div class="passwordInfo">
		 <c:choose>                                                                          
	            <c:when test="${empty pwInfo}">                                                 
	                <p class="false">조회결과가 없습니다.</p>                                        
	            </c:when>                                                                         
	            <c:otherwise>                                                                     
	                <p class="true">${pwInfo.pw1}</p>                                              
	            </c:otherwise>                                                                    
	        </c:choose>
	    </div>   
	    <div class="links">
		    <a href="/members/searchPw">되돌아가기</a>
		    <a href="/members/login">로그인하기</a>
	    </div>
    </div>
</body>
</html>