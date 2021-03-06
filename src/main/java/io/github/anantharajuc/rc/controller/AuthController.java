package io.github.anantharajuc.rc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.rc.dto.UserDTO;
import io.github.anantharajuc.rc.service.AuthServiceImpl;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
public class AuthController 
{
	@Autowired
	private AuthServiceImpl authServiceImpl;

	@PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserDTO userDto) 
	{
		authServiceImpl.signup(userDto);
		
        return ResponseEntity.status(OK).body("User Registration Successful!");
    }
}
