package test.java.org.zsl.testmybatis;

import main.java.com.cn.lpd.entity.User;
import main.java.com.cn.lpd.service.UserService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	//@Resource
	@Autowired
	private UserService userService = null;
	
	@Test
	public void test(){
		User user = userService.findUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
