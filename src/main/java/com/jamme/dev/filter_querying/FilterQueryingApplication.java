package com.jamme.dev.filter_querying;

import com.jamme.dev.filter_querying.model.Customer;
import com.jamme.dev.filter_querying.service.CustomerService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class FilterQueryingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterQueryingApplication.class, args);
	}
/*
	@Bean
	CommandLineRunner init (CustomerService customerService) {
		return args -> {

			List<Customer> customers = Arrays.asList(
					new Customer("199909090123", "Jamme", "Dev", true, false, false, "GREEN"),
					new Customer("198806152345", "Laura", "Smith", false, true, false, "PENDING"),
					new Customer("197503121234", "Michael", "Johnson", true, false, true, "RED"),
					new Customer("199212200987", "Sarah", "Williams", true, false, false, "GREEN"),
					new Customer("200103150456", "David", "Brown", false, true, true, "PENDING"),
					new Customer("196802170321", "Emma", "Jones", true, true, false, "GREEN"),
					new Customer("199501250123", "Daniel", "Garcia", true, false, true, "RED"),
					new Customer("198912110789", "Sophia", "Martinez", false, true, false, "PENDING"),
					new Customer("199708210555", "John", "Rodriguez", true, true, false, "GREEN"),
					new Customer("199305061111", "Emily", "Lewis", true, false, true, "RED"),
					new Customer("197912020222", "Ryan", "Walker", false, true, false, "PENDING"),
					new Customer("200005030303", "Grace", "Hall", true, true, true, "GREEN"),
					new Customer("198706180999", "Kevin", "Young", false, false, true, "RED"),
					new Customer("199405150123", "Chloe", "Allen", true, true, false, "GREEN"),
					new Customer("199207250789", "Nathan", "Hernandez", false, true, true, "PENDING"),
					new Customer("200104200456", "Mia", "King", true, false, false, "GREEN"),
					new Customer("198910150987", "Lucas", "Wright", false, true, false, "RED"),
					new Customer("197805110321", "Madison", "Lopez", true, false, true, "GREEN"),
					new Customer("199301240555", "Liam", "Hill", false, true, false, "PENDING"),
					new Customer("200001010456", "Amelia", "Scott", true, true, true, "RED"),
					new Customer("199604170999", "Mason", "Green", true, false, false, "GREEN"),
					new Customer("198501230111", "Olivia", "Adams", false, true, true, "PENDING"),
					new Customer("199008300222", "Noah", "Baker", true, true, false, "GREEN"),
					new Customer("200203091234", "Lily", "Gonzalez", false, false, true, "RED"),
					new Customer("199407071234", "Ethan", "Nelson", true, true, true, "PENDING"),
					new Customer("198312120987", "Zoe", "Carter", false, true, false, "GREEN"),
					new Customer("199707250555", "Samuel", "Mitchell", true, false, false, "RED"),
					new Customer("200002150111", "Sofia", "Perez", false, true, true, "GREEN"),
					new Customer("198911200987", "Isaac", "Roberts", true, false, true, "PENDING"),
					new Customer("199109090555", "Ella", "Turner", true, true, false, "RED"),
					new Customer("199612210222", "Jayden", "Phillips", false, true, false, "GREEN")
			);
			customerService.createCustomers(customers);

		};

	}

 */

}
