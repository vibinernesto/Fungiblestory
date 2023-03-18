package com.fungiblestory.writer.controller;

import java.util.List;

import com.fungiblestory.writer.Util.ResponseUtil;
import com.fungiblestory.writer.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fungiblestory.writer.model.User;
import com.fungiblestory.writer.service.UserService;

@RestController
@RequestMapping("/general")
public class UserController {
	Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserServiceImpl userServiceImpl;
	@GetMapping("/getUsers")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<User>> getUsers() {
		logger.info("Inside getListOfUsers() - "+ userServiceImpl.getListOfUsers());
		return new ResponseEntity<List<User>>(userServiceImpl.getListOfUsers(), HttpStatus.OK);
	}

	@PostMapping("/addUser")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Object> addNewUser(@RequestBody User user) {
		logger.info("Inside addNewUser() function");
		ResponseEntity<Object> responseUtil = null;
		User insertedValue = null;
		try {
			insertedValue = userServiceImpl.addNewUser(user);
			responseUtil = ResponseUtil.generateResponse("Data is added successfully!", HttpStatus.CREATED, insertedValue);
		}catch(Exception exception){
				responseUtil = ResponseUtil.generateResponse("User Creation Denied", HttpStatus.BAD_REQUEST, exception.getMessage());
		}
		return responseUtil;
	}

	@PutMapping("/updateUser")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Object> updateUser(@RequestBody User user) {
		logger.info("Inside updateUser() function");
		ResponseEntity<Object> responseUtil = null;
		User udpatedValue = null;
		try {
			udpatedValue = userServiceImpl.updateExistingUser(user);
			responseUtil = ResponseUtil.generateResponse("User is successfully updated!", HttpStatus.OK, udpatedValue);
		}catch(Exception exception){
			responseUtil = ResponseUtil.generateResponse("User Creation Denied", HttpStatus.BAD_REQUEST, exception.getMessage());
		}
		return responseUtil;
	}

}
