package com.fungiblestory.writer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fungiblestory.writer.dao.UserRepository;
import com.fungiblestory.writer.model.User;
import com.fungiblestory.writer.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	public List<User> getListOfUsers() {
		return userRepository.findAll();
	}
}
