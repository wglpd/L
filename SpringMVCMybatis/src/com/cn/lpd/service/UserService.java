package main.java.com.cn.lpd.service;

import javax.annotation.Resource;

import main.java.com.cn.lpd.entity.User;
import main.java.com.cn.lpd.mapper.UserMapper;

import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public User findUserById(int Id){
		return userMapper.selectByPrimaryKey(Id);
	}
}
