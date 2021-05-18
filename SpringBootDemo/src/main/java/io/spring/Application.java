package io.spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cuchuoi.Employee;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Configuration
@ComponentScan(basePackages = {"io.spring", "com.cuchuoi"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public Employee getEmployee() {
		Employee e = new Employee();
		e.setName("HuyPN6");
		return e;
	}
	
	@Bean
	@Qualifier("Employee2")
	public Employee getEmployee2() {
		Employee e = new Employee();
		e.setName("YoungDeveloper");
		return e;
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
