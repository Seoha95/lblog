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
이 서비스의 핵심은 사용자가 원하는 카테고리의 게시물을 작성할 수 있습니다.   
그리고 게시물의 댓글을 작성하고 삭제하는 기능이 있습니다.    
또한 게시물이 8개가 넘으면 페이징 기능이 있어서 페이지가 생기고 게시물이 다음 페이지에 표시가 됩니다.   
   
<details>
<summary>핵심기능설명펼치기</summary>   
   
#### 4-1. 핵심코드   
   
   
#### 4-2. summernote로 게시물 에디터 기능
 * 게시물을 작성하고   
#### 4-3. 장바구니   
 * 장바구니에 상품 담기 📍[코드확인](https://github.com/Seoha95/marguerite/blob/8a785e7e7adf4bf9632a3b73bb1d144eee24c273/src/dao/DAO.java#L470-L507)   
    * 이미 있는 상품을 장바구니에 담았을 때 수량만 업데이트하고 없는 상품을 담았을 때 insert를 할 수 있습니다.   
   
#### 4-4. 검색기능   
 * 상품 검색 기능 📍[코드확인](https://github.com/Seoha95/marguerite/blob/1fb810d8ee963d0f779f423048e90d01b9295b1b/src/dao/DAO.java#L205-L232)   
    * 상품을 검색하는 기능입니다.      
   
#### 4-4. 베스트 상품보기   
 * 베스트 상품 띄우기 기능 📍[코드확인](https://github.com/Seoha95/marguerite/blob/8a785e7e7adf4bf9632a3b73bb1d144eee24c273/src/dao/DAO.java#L255-L277)    
    * PRODUCT3 테이블을 판매량과 가격을 내림차순으로 정렬해서 10개의 상품만 검색되도록 작성했습니다.    
    * 판매량이 높고 가격이 높은 10개 상품이 베스트 상품으로 뜨게 됩니다.   
 
#### 4-5 회원정보 조회 
 * 관리자모드 회원정보 조회 기능 📍[코드확인](https://github.com/Seoha95/marguerite/blob/8a785e7e7adf4bf9632a3b73bb1d144eee24c273/src/dao/DAO.java#L686-L715)   
   * SIGNUP3, shipping 테이블을 id로 조인하여 회원의 정보를 조회합니다.    
   * 회원의 아이디, 비밀번호, 전화번호, 이름, 주소를 확인할 수 있습니다.      
 
</br>
</details>   
   
### 5.핵심 트러블 슈팅   
   
#### 5-1 상품을 결제를 할 때와 상품 삭제를 할 때 이동 페이지 다르게 주는 문제   
선택한 상품을 결제할 때는 아임포트 결제 API 페이지가 띄워지고 상품을 삭제를 할 때에도    
아임포트 결제 API 페이지를 들렸다가 삭제가 되는 문제가 있었으나 버튼 클릭시 이동페이지를    
다르게 설정해서 분리 시킬 수 있었습니다.   
   
<details>      
<summary>기존코드</summary>      
   
<img src="./기존코드.PNG" width="900" height="900">   
     
</details>       
          
<details>      
<summary>개선된 코드</summary>      
   
<img src="./이동경로설정2.PNG" width="600" height="600">   
   
<img src="./이동경로설정.PNG" width="900" height="900">    
</details>   
   
   
### 6. 느낀점    
   
블로그를 구현할 때 카테고리별로 게시물을 가져오고 해당 페이지 상단 메뉴바만 색이 다르게 구현하려고 할 때    
어떻게 구현을 할지 고민을 하고 구현은 header에서 맛집, 여행, 카페, 취미 카테고리를 클릭하면 해당 카테고리를   
카페?카테고리='맛집' 이런식으로 넘겨주어서 카테고리별로 데이터를 뽑을 수 있었습니다.    
