package com.springannotation.springannotion;

import com.springannotation.springannotion.Controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringannotionApplication {

	private static org.springframework.context.ConfigurableApplicationContext ConfigurableApplicationContext;

	public static void main(String[] args) {
 	ConfigurableApplicationContext=	SpringApplication.run(SpringannotionApplication.class, args);
   PizzaController pizzaController=  ConfigurableApplicationContext.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}

}
