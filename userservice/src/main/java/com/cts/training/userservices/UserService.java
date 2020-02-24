package com.cts.training.userservices;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.cts.training.userservice.entity.User;
import com.cts.training.userservice.repository.UserRepository;

// @Component
@Service
public class UserService implements IUser {

	private static final Id Id = null;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAllUsers() {
		// add additional logic
		return this.userRepository.findAll();
	}
	
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		// resolves problem of null reference exception
		Optional<User> record =  this.userRepository.findById(id);
		// reduces the chance of NullException
		
		// can check if object is there
		User user = new User();
		if(record.isPresent())
			user = record.get();
		return user;
		
	}

	@Override
	public boolean addUser(User User) {
		// TODO Auto-generated method stub
		this.userRepository.save(User);
		return true;
	}

	@Override
	public boolean updateUser(User User) {
		// TODO Auto-generated method stub
		this.userRepository.save(User);
		return true;
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(Id);
		return true;
	}
}
