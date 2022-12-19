package com.blog.blogappapis.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.blog.blogappapis.payloads.UserDto;
import com.blog.blogappapis.repositories.UserRepo;
import com.blog.blogappapis.services.UserService;



public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto user) {
		this.userRepo.save(user);

		return null;
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}



private User dtoToUser(UserDto userDto)
{
	User user = new User();
	user.setId(userDto.getId());
	user.setName(userDto.getName());
	user.setEmail(userDto.getEmail());
	user.setAbout(userDto.getAbout());
	user.setPassword(userDto.getPassword());
	return user;
}

public UserDto userToDto(User user)
{
	UserDto userDto = new UserDto();
	userDto.setId(user.getId());
	userDto.setName(user.getName());
	userDto.setEmail(userDto.getEmail());
	userDto.setEmail(userDto.getEmail());
	userDto.setPassword(user.getPassword());
	userDto.setAbout(user.getAbout());
	return userDto;


}
}
