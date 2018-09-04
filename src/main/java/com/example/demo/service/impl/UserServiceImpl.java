package com.example.demo.service.impl;

import com.example.demo.dao.User;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository mUserRepoitory;

    @Override
    public UserDTO getUserById(long id) {

        boolean isUSerPresent = mUserRepoitory.findById(id).isPresent();
        if (!isUSerPresent) {
            return null;
        }
        User user = mUserRepoitory.getOne(id);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        User newUser = mUserRepoitory.save(user);
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setName(newUser.getName());
        userDTO1.setId(newUser.getId());
        return userDTO1;
    }
}
