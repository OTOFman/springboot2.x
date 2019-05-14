package com.otof.springboot2.x;

import com.otof.springboot2.x.service.DynamicVehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		SpringApplication.run(Application.class, args);
		DynamicVehicle.run();
	}

}
