package com.demo1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserRepository {
    private List<String> users;

    public UserRepository() {
        //Datos de ejemplo
        users = new ArrayList<>();
        users.add("Usuario1");
        users.add("Usuario2");
        users.add("Usuario3");
    }

    public List<String> getUsers() {
        return users;
    }
}
