package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ashokit.entity.Employee;
import com.ashokit.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(Application.class, args);
		
		EmployeeRepo repo = ctx.getBean(EmployeeRepo.class);
		
		
		
		
		Sort ascending = Sort.by("empName").ascending();
		
		List<Employee> emps = repo.findAll(ascending);
		
		emps.forEach(System.out::println);
		
		System.out.println("==================================");
		Sort asc = Sort.by("empName","empsal").ascending();
		
        List<Employee> emp = repo.findAll(asc);
		
		emp.forEach(System.out::println);
		
		
		System.out.println("<-----------------pagination-------------->");
		
		int pagenum=3;
		PageRequest page = PageRequest.of(pagenum-1, 3);
		
		 Page<Employee> findAll = repo.findAll(page);
		 
		 List<Employee> content = findAll.getContent();
		 content.forEach(System.out::println);
		 
		 System.out.println("<-----------QBE Executor------------>");
		 
		 Employee e=new Employee();
		 e.setEmpGender("Fe-Male");
		 e.setDept("Admin");
		 Example<Employee> of = Example.of(e);
		 List<Employee> findAll2 = repo.findAll(of);
		 findAll2.forEach(System.out::println);
		 
		 
		 
	     
	}

}
