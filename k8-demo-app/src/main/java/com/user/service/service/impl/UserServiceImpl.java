package com.user.service.service.impl;

import com.user.service.modal.UserDetails;
import com.user.service.repository.UserDetailsRepo;
import com.user.service.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDetailsRepo userDetailsRepo;

    @Override
    public void saveUser(UserDetails userDetails) {
        userDetailsRepo.save(userDetails);
    }

    @Override
    public List<UserDetails> getAllUsers() {
       return userDetailsRepo.findAll();
    }
}
