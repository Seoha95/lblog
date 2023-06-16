package com.haru.mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.haru.model.MemberVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTest {

    private static final Logger log = LoggerFactory.getLogger(MemberMapperTest.class);
    
    @Autowired
    private MemberMapper mapper;

    @Test
    public void testRegister() throws Exception{
        
        MemberVO vo = new MemberVO();
        
        vo.setId("mapper test");
        vo.setPw1("mapper test");
        vo.setName("mapper test");
       
        mapper.register(vo);
        
    }
    
    @Test
    public void testLogin() throws Exception{
    	
    	MemberVO member = new MemberVO(); 
    	
    	// 올바른 입력시
    	member.setId("kim@naver.com");
    	member.setPw1("1234");
    	
    	// 잘못된 입력시
    	//member.setId("kim22@naver.com");
    	//member.setPw1("1111");
    	
    	mapper.login(member);
    	System.out.println("결과 값: " + mapper.login(member));
    }
}
