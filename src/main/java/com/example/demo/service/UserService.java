package com.example.demo.service;

import com.example.demo.model.UserData;
import com.example.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserDataRepository repository;

    public List<UserData> findAll(){
        return (List<UserData>) repository.findAll();
    }

}
