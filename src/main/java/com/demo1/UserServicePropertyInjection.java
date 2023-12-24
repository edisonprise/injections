package com.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServicePropertyInjection implements UserService{

    //Inyeccion por propiedad
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<String> getAllUsers() {
        return userRepository.getUsers();
    }
}
