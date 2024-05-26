package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Address;
import com.example.Entity.Users;
import com.example.Entity.Users;
import com.example.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	
	
	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    
    
    
    
    @PostMapping("/ad")
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/getAll")
	public List<Users> getAlluserController()
	{
		return this.userService.getAllService();
	}
    
    @GetMapping("/getAll/address")
   	public List<Address> getAllAddressController()
   	{
   		return this.userService.getAllAddressService();
   	}
    
}
