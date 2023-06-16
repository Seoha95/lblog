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
		height: 450px;
	}
	
	.title{
		margin-bottom: 40px;
		font-size: 50px;
		font-weight:bold;
		border-bottom: 1px solid black;
		padding-bottom: 20px;
		color: #90caf9;
	}
	
	.input{
		text-align: left;
		width: 225px;
		height: 30px;
		border: none;
		border-bottom: 3px solid #90caf9;
		outline: none;
	}

	input::placeholder {
		color: #90caf9;
		font-size: 15px;
	}

	#name {
		margin-left: 25px;
	}
	
	.pw1 {
		margin-bottom: 50px;
	}
	
	label{
		color: #90caf9;
		font-weight: bold;
	}
	
		button{
		width: 300px;
		height: 40px;
		border-radius: 20px;
		font-size: 18px;
		font-weight:bold;
		border:none;
		background-color: #90caf9;
		color: white;
		
	}
	
</style>
<meta charset="UTF-8">
<title>FindPwForm</title>
</head>
<body>
    <div class="container">
    <form action="/members/idFind" method="post" >
		<div class="title">아이디 찾기</div>	
		<div class="name">
		<label for="name">이름</label>
		<input type="text" class="input" id="name" name="name" placeholder="이름을 입력"maxlength="20">
		</div>
		<div class="pw1">
		<label for="pw1">비밀번호</label>
		<input type="password" class="input" id="pw1" name="pw1" placeholder="비밀번호를 입력" maxlength="20">
		</div>
		
		<div class="btn_find">
		<button type="submit" id="btn_find">찾기</button>
		</div>
	</form>    
	</div>
</body>
</html>