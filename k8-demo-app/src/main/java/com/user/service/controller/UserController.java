package com.user.service.controller;

import com.user.service.dto.UserDetailsDto;
import com.user.service.modal.UserDetails;
import com.user.service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserDetailsDto userDetailsDto) {
        UserDetails userDetails = new UserDetails();
        userDetails.setName(userDetailsDto.getName());
        userDetails.setPhone(userDetailsDto.getPhone());
        userDetails.setEmail(userDetailsDto.getEmail());
        userService.saveUser(userDetails);
        return new ResponseEntity<String>("Success", HttpStatus.CREATED);
    }

    @GetMapping
    public List<UserDetails> getAllUsers() {
        return userService.getAllUsers();
    }
}
