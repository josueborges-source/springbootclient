package com.jayybe.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@CrossOrigin(origins = "http://localhost:4200")
	public class UserController {

	    // standard constructors
	    @Autowired
	    private UserRepository userRepository;

	    @GetMapping("/users")
	    public List<Users> getUsers() {
	        return (List<Users>) userRepository.findAll();
	    }

	    @PostMapping("/users")
	    void addUser(@RequestBody Users user) {
	    	System.out.println("Salvando: "+ user);
	        userRepository.save(user);
	    }
	}

