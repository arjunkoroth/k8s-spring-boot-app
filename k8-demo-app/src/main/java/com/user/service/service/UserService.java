package com.user.service.service;

import com.user.service.modal.UserDetails;

import java.util.List;

public interface UserService {
    public void saveUser(UserDetails userDetails);
    public List<UserDetails> getAllUsers();
}
