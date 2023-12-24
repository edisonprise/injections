package com.demo1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo1Application.class, args);
	}
	@Autowired
	private UserServiceConstructorInjection userServiceConstructorInjection;

	@Autowired
	private UserServiceSetterInjection userServiceSetterInjection;

	@Autowired
	private UserServicePropertyInjection userServicePropertyInjection;

	@PostConstruct
	public void executeExample() {
		//Constructor injection
		System.out.println("Constructor Injection: " + userServiceConstructorInjection);

		//Setter Injection. En este caso, debemos proveer la instancia del UserRepository
		//para que la clase pueda realizar el set correspondiente
		UserRepository userRepository = new UserRepository();
		userServiceSetterInjection.setUserRepository(userRepository);
		System.out.println("Setter Injection: " + userServiceSetterInjection.getAllUsers());

		//Field Injection
		System.out.println("Field Injection: " + userServiceConstructorInjection.getAllUsers());
	}

}
