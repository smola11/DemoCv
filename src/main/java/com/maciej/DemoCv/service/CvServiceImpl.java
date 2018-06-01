package com.maciej.DemoCv.service;

import com.maciej.DemoCv.entity.User;
import com.maciej.DemoCv.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvServiceImpl implements CvService {

    private UserRepository userRepository;

    public CvServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> importAll() {
        return userRepository.findAll();
    }

}
