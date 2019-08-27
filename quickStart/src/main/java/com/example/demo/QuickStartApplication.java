package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerList;

@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(QuickStartApplication.class, args);
	
		Customer ramesh = ctx.getBean("customer",Customer.class);
		
		System.out.println(ramesh.hashCode());
		
		System.out.println(ramesh.getCustomerId());
		System.out.println(ramesh.getCustomerName());
		System.out.println(ramesh.getAmountDue());
		System.out.println(ramesh.getAddress());
       
		Customer ramesh2 = ctx.getBean("customer",Customer.class);
		
		System.out.println(ramesh2.hashCode());
		
		CustomerList list = ctx.getBean(CustomerList.class);
		
		//  Method Reference
		list.getCustList().forEach(System.out::println);
		
		Map<Long,Customer> data = list.getCustDetails();
		
		 System.out.println(data.get(102L));

		ctx.close();
	
	}

}
