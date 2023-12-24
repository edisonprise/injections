package com.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceConstructorInjection implements UserService{
    private UserRepository userRepository;

    //Cuando inyectamos por constructor, desde la version 4.3, la anotacion no es necesaria colocarla
    //pero se prefiere por motivos de legibilidad del codigo
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<String> getAllUsers() {
        return userRepository.getUsers();
    }
}
