package com.fungiblestory.writer.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fungiblestory.writer.dao.UserRepository;
import com.fungiblestory.writer.model.User;
import com.fungiblestory.writer.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	UserRepository userRepository;

	public List<User> getListOfUsers() {
		logger.info("Inside UserServiceImpl get list of users function ");
		return userRepository.findAll();
	}

	public User addNewUser(User user) {
		logger.info("Inside UserServiceImpl add new user function "+user.toString());
		User saveData = null;
		try {
			saveData = userRepository.save(user);
		}catch(Exception exception){
			logger.info("Error in adding new user - "+exception);
		}
		return saveData;
	}

	@Transactional
	public User updateExistingUser(User user) {
		logger.info("Inside UserServiceImpl add new user function "+user.toString());
		User saveData = null;
		try {
			saveData = userRepository.save(user);
		}catch(Exception exception){
			logger.info("Error in adding new user - "+exception);
		}
		return saveData;
	}

}
