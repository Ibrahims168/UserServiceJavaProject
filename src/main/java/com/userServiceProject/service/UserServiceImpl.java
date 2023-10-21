package com.userServiceProject.service;

import com.userServiceProject.feignClientPollService.PollService;
import com.userServiceProject.model.User;
import com.userServiceProject.repository.UserRepository;
import jdk.security.jarsigner.JarSignerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PollService pollService;

    @Override
    public Long createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteUserById(id);
        pollService.deleteAllUserAnswers(id);
    }

    @Override
    public User getUserById(Long id) throws JarSignerException {
        return userRepository.getUserById(id);
    }

    @Override
    public User registerUser(Long userId) {
        return userRepository.registerUser(userId);
    }

    @Override
    public Boolean isUserRegistered(Long userId) {
        User user = userRepository.getUserById(userId);
        return user != null && user.getStatus();
    }
}
