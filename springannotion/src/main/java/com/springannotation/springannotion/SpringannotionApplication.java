package com.springannotation.springannotion;

import com.springannotation.springannotion.Configurartion.Employee;
import com.springannotation.springannotion.Configurartion.Student;
import com.springannotation.springannotion.Controller.PizzaController;
import com.springannotation.springannotion.MyPack.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringannotionApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("s1")
	Student student;
	@Autowired
	Dog dog;
	@Autowired
	Employee employee;
	private static org.springframework.context.ConfigurableApplicationContext ConfigurableApplicationContext;

	public static void main(String[] args) {
 	ConfigurableApplicationContext=	SpringApplication.run(SpringannotionApplication.class, args);
   PizzaController pizzaController=  ConfigurableApplicationContext.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.doingSomething();
		this.dog.dogEating();
		this.employee.getNameOfEmployee();
		this.student.createSomething();

	}
}
