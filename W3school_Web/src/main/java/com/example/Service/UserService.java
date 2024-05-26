package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Address;
import com.example.Entity.Users;

import com.example.Entity.Users;
import com.example.Repo.AddressRepository;
import com.example.Repo.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	
	 private final UserRepository userRepository;
	 
	 @Autowired
	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }
	 
	 @Autowired
	 AddressRepository addressRepo;
	 

	    @Transactional
	    public Users createUser(Users user) {
	        return userRepository.save(user);
	    }
	    
	    public List<Users> getAllService()
		{
			return this.userRepository.findAll();
		}
	    

	    public List<Address> getAllAddressService()
		{
			return this.addressRepo.findAll();
		}
}
