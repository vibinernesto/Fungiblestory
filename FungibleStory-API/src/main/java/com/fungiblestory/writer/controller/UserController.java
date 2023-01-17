package com.fungiblestory.writer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fungiblestory.writer.model.User;
import com.fungiblestory.writer.service.UserService;

@RestController
@RequestMapping("/general")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getListOfUsers() {
		return new ResponseEntity<List<User>>(userService.getListOfUsers(), HttpStatus.OK);
	}

}
