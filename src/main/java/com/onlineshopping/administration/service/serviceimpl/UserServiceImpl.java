package com.onlineshopping.administration.service.serviceimpl;

import com.onlineshopping.administration.entity.User;
import com.onlineshopping.administration.repository.UserRepository;
import com.onlineshopping.administration.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

}
