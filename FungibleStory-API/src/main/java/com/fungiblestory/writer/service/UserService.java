package com.fungiblestory.writer.service;

import java.util.List;
import com.fungiblestory.writer.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

	public List<User> getListOfUsers();
	public User addNewUser(User user);
	public User updateExistingUser(User user);
}
