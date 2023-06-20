## :pushpin: lblog
>블로그 웹 사이트

</br>

### 1.제작기간&참여 인원
* 2023.06.05 ~ 2023.06.16
* 개인 프로젝트

</br>

### 2.사용기술
* JAVA11   
* MySQL   
* JAVASCRIPT   
* AJAX
* spring MVC   
* summernote
* css   

</br>   

### 3.프로젝트 스토리보드       
[storyboard.pdf](https://github.com/Seoha95/lblog/files/11785004/storyboard.pdf)    
</br>

### 4.프로젝트 영상
![lblog](https://github.com/Seoha95/lblog/assets/107228582/ef6245e0-2e99-4989-bb47-85c4907df3d3)

</br>

### 5.핵심기능
 * 회원 가입 및 로그인 기능 : 사용자가 회원으로 가입하고 로그인하여 블로그를 작성하고 관리할 수 있습니다.
 * 블로그 작성 및 관리 : 사용자는 블로그를 작성하고 수정할 수 있습니다.
 * 댓글 기능 : 사용자는 블로그에 댓글을 작성하고 작성한 댓글을 삭제할 수 있습니다.
 * 검색 기능 : 사용자가 원하는 게시물을 제목이나 내용에 포함된 키워드를 검색하여 조회할 수 있습니다.   
   
<details>
<summary>핵심기능설명펼치기</summary>   
   
#### 5-1. 사용자의 회원등록 및 인증      
 * 회원가입 기능  📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/members/joinForm.jsp#L111-L185)
     * 아이디 입력 : 사용자는 아이디를 입력해야 합니다. 입력한 아이디는 중복 여부를 확인하기 위해 실시간으로
       서버와 통신하여 검사됩니다.
        * 중복된 아이디인 경우 : "사용할 수 없는 이메일입니다." 메세지가 빨간색으로 표시됩니다.
        * 중복되지 않은 아이디인 경우 : "사용할 수 있는 이메일입니다." 메세지가 파란색으로 표시됩니다.
      * 비밀번호 입력 및 확인 : 사용자는 비밀번호와 비밀번호 확인을 입력해야 합니다.       
         * 비밀번호와 비밀번호 확인이 일치하는 경우 : "비밀번호 일치" 메세지가 파란색으로 표시됩니다.
         * 비밀번호와 비밀번호 확인이 일치하지 않는 경우 : "비밀번호 불일치" 메세지가 빨간색으로 표시됩니다.
      * 사용자 등록 : 기본정보 입력 후 가입하기 버튼을 클릭하면 회원등록이 됩니다.
* 로그인 기능 📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/members/loginForm.jsp#L85-L99)   
   * 사용자 인증 : 로그인 페이지를 통해 사용자의 아이디과 비밀번호를 입력받아 인증합니다.  
   
#### 5-2. summernote로 게시물 등록 및 수정      
 * 게시물 등록 기능 📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/boardList/writing.jsp#L49-L137)
    * 게시물 등록 : 사용자가 제목과 내용을 입력하고 카테고리를 선택하냐 후 게시물을 등록할 수 있는 기능입니다.
    * 게시물 수정 : 사용자가 작성자일 경우 제목과 내용을 수정할 수 있습니다.
       
#### 5-3. 게시물 상세보기와 댓글 등록 및 삭제            
 * 게시물 상세보기와 댓글 등록 및 삭제 📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/boardList/get.jsp#L101-L251)   
   * 게시물 상세보기 : 비회원과 회원 둘 다 게시물을 볼 수 있고 게시물 작성자에게만 게시물 하단에 목록보기와 수정하기가 뜹니다.
   * 게시물에 대한 댓글 등록 : 로그인 시에만 작성할 수 있고 자동으로 작성자란에 아이디가 들어가고 댓글내용 부분에 원하는 댓글을 쓰고 등록할 수 있습니다.
   * 게시물 댓글보기 및 삭제 : 댓글보기를 클릭 시, 로그인을 안했을 경우 로그인 페이지로 넘어가고 로그인 시에는 댓글들을 볼 수 있습니다. 그리고
     댓글 작성자에게만 삭제버튼이 보이고 댓글을 삭제할 수 있습니다.       
   
#### 5-4. 카테고리별 게시물 조회    
 * 카테고리 넘기기📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/set/header.jsp#L124-L130)   
   * header에서 맛집, 카페, 취미, 여행 카테고리 중에 하나를 선택시에 카테고리 정보도 url을 통해 같이 넘깁니다.   
 * 카테고리별 처리하기 📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/java/com/haru/controller/BoardListController.java#L45-L131)   
    * 카테고리 정보가 넘어오면 해당 카테고리 목록을 가져오도록 합니다.
 * 카테고리별 게시물 총 갯수 📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/resources/com/haru/mapper/BoardListMapper.xml#L68-L73)
    * 카테고리 정보가 넘어오면 예를 들어 취미라면 취미로 등록된 카테고리의 갯수를 뽑아서 화면에 출력해줍니다.     
#### 5-5. 게시물 검색     
 * 게시물 검색 기능 📍[코드확인1](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/set/header.jsp#L109-L122)                    [코드확인2](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/set/header.jsp#L133-L140)
    * 검색을 할 때 키워드를 통해 일치하는 제목이나 내용을 조회해줍니다.   
 
#### 5-6 페이징 기법    
 * 취미, 맛집, 카페, 여행 페이지만 페이징 기법 적용 📍[코드확인](https://github.com/Seoha95/lblog/blob/0433ad688556013f3fbf6a2d006dd07db3abb1c3/Lblog/src/main/webapp/WEB-INF/views/boardList/travel.jsp#L96-L176)   
    * 여행페이지를 예시로 설명하면 이전페이지로 가는 화살표는 11페이지로 넘어가면 표시되고 다음페이지 화살표는 11페이지 이상일 때 10페이지 전에 가 있으면 표시된다.
    * 해당 페이지는 삼항 연산자를 통해서 해당 페이지일 경우에는 색이 글자 위에 씌워지게 설정을 했습니다.
    * 카테고리별로 게시물이 1개부터 8개까지만 한 페이지 당 표시되도록 설정했습니다.         
 
</br>
</details>   
   
### 6.핵심 트러블 슈팅   
   
#### 6-1 첫 댓글 등록 문제
처음에는 댓글을 등록할 때 블로그에서 바로 등록을 못하고 db에서 첫 댓글 데이터를 넣어줘야 등록되는 문제가 있었습니다.   
form으로 댓글등록 하던 것을 javascript를 통해서 넘겨주면서 해결이 되었습니다.   
   
<details>      
<summary>기존코드</summary>      
                
</details>	

<details>
<summary>개선된 코드</summary>
</details>
               

   
   
### 6. 느낀점    
처음으로 혼자서 설계부터 원하는 형태로 구현을 하다보니 막히는 부분도 많았지만   
끝까지 포기하지 않고 해결한 결과로 막히는 부분 해결하는 속도가 빨라졌습니다.   
