package com.demo1;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceSetterInjection implements UserService{
    private UserRepository userRepository;
    @Override
    public List<String> getAllUsers() {
        return userRepository.getUsers();
    }

    //Este metodo hara la inyeccion de la instancia que se provea a esta clase
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
