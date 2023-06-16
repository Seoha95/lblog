package com.haru.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.haru.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberSerivceTest {
	
	@Autowired
	private MemberService service;
	    
	    @Test
	    public void testRegister() throws Exception{
	        
	        MemberVO vo = new MemberVO();
	        
	        vo.setId("service test");
	        vo.setPw1("service test");
	        vo.setName("service test");
	        

	        service.register(vo);
	        
	    }
}
