package com.example.demo.service;

import com.example.demo.dto.UserDTO;

public interface UserService {

    UserDTO getUserById(long id);

    UserDTO createUser(UserDTO userDTO);
}
