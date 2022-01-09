package com.trinity;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.trinity.service.IEmployeeService;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootApp1Application.class, args);
		IEmployeeService empService = applicationContext.getBean("service", IEmployeeService.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i;
		try {
			System.out.println("Enter the Employee id to fetch the Details");
			i = Integer.parseInt(br.readLine());
			System.out.println("Employee details for the given id are :: " + empService.getEmployeeById(i));

			System.out.println();
			System.out.println("Enter the name of the Employee to get details.");
			String name = br.readLine();
			System.out.println("Employee details by the name are : " + empService.getEmployeeByUserName(name));
			((BufferedReader) applicationContext).close();
		} catch (Exception e) {
			System.out.println("Employee Details are not found for the given ID");
		}

	}
}
