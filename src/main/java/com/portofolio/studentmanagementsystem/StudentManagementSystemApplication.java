package com.portofolio.studentmanagementsystem;

import com.portofolio.studentmanagementsystem.repository.StundentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StundentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


	}
}
