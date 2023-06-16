<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
 <style>
         * { box-sizing:border-box; }

.lblog{
	text-decoration: none;
	color: #90caf9;
}
 .msg {
       color:red;
        }
 #idCheck{
 	margin-left: 100px;
 }       
 #pwConfirm{
 	margin-left: 20px;
 }
        
div {
     box-sizing:border-box; 
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
		
	}	
	
		input{
		text-align: left;
		width: 225px;
		height: 30px;
		border: none;
		border-bottom: 3px solid #90caf9;
		
	}       
	
		input::placeholder {
		color: #90caf9;
		font-size: 15px;
	}
		
	.inputBox{
		padding-bottom: 20px;
		padding-top: 22px;
		outline: none;
	}
	
 	.id > label{
		margin-right: 60px;
	}
	
	.pw1 > label{
		margin-right: 50px;
	}
	.pw2 > label{
		margin-right: 15px;
	} 
	.name > label{
		margin-right: 80px;
	}
	
	label{
		color: #90caf9;
		font-weight: bold;
	}

		
	button{
		width: 350px;
		height: 40px;
		border-radius: 20px;
		margin-top:40px;
		font-size: 18px;
		font-weight:bold;
		border:none;
		background-color: #90caf9;
		color: white;
		
	}
	
	.links{
		margin-top: 10px;
		color: gray;
		text-align: center;
	}
	       
        
</style>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
        
<body>
	<div class="container">
	    <form action="/members/join" method="post">
			<div class="title"><a class="lblog" href="/">LBLOG</a></div>	
			
			<div class="id">
				<label for="id">아이디</label>
				<input type="text" class="inputBox" id="id" name="id" placeholder="예시: 아이디@lblog.com" title="ID"  maxlength="20" autofocus required>
				<div id="idCheck" class="msg"></div> 
			</div>
			
			<div class="pw1">
				<label for="pw1">비밀번호</label>
				<input type="password" class="inputBox" id="pw1" name="pw1" placeholder="비밀번호 입력"  maxlength="20" required>
				<div id="pw1Msg" class="msg"> </div> 
			</div>
			
			<div class="pw2">
				<label for="pw2">비밀번호 확인</label>
				<input type="password" class="inputBox" id="pw2" name="pw2" placeholder="비밀번호 재확인 입력"  maxlength="20" required>
				<div id="pwConfirm" class="msg" onchange="Confirm()"></div> 
			</div>
			
			<div class="name">
				<label for="name">이름</label>
				<input type="text" class="inputBox" id="name" name="name" placeholder="이름 입력" maxlength="50" required>
			</div>
			
		<div class="join_btn"> 	
			<button type="submit">가입하기</button>
		</div>	
		</form>
	</div>
	
	<script>
	
	$(function(){
		$("#id").on('keyup',idCheck);
	    $("#pw2").on('keyup',Confirm);
		
	})
	
	function idCheck(){
		 var id = $("#id").val();
		 var sendData = {"id":id};
    $.ajax({
    	 method : 'POST',
         url : '/members/idCheck',
         data : sendData,
        success : function(result){
            if(result == 'fail'){
                $('#idCheck').css('color','red');
                $('#idCheck').html("사용할 수 없는 이메일입니다.");
                flag=false;
            }else{
                $('#idCheck').css('color','blue');
                $('#idCheck').html("사용할 수 있는 이메일입니다.");
                flag=true;
            }}
    })
}

 	function Confirm() {
		
			var password = document.getElementById('pw1');					//비밀번호 
			var passwordConfirm = document.getElementById('pw2');	//비밀번호 확인 값
			
			if(password.value == passwordConfirm.value){//password 변수의 값과 passwordConfirm 변수의 값과 동일하다.
				document.getElementById('pwConfirm').style.color = 'blue';
				document.getElementById('pwConfirm').innerHTML ="비밀번호 일치";
			}else{
				document.getElementById('pwConfirm').style.color = 'red';
				document.getElementById('pwConfirm').innerHTML ="비밀번호 불일치";
			}
		} 
	</script>	
	
	
	
	

	
	
	
</body>
</html>