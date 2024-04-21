package com.john.springdatajpaex;

import com.john.springdatajpaex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("John");
		s1.setMarks(25);

		s2.setRollNo(102);
		s2.setName("Mark");
		s2.setMarks(32);

		/* save to db */
		repo.save(s2);

		/* delete user */
//		repo.delete(s2);
		
		Optional<Student> s = repo.findById(102);
		/* find All show on terminal */
//		System.out.println(s.orElse(new Student()));

		/* find by name */
		System.out.println(repo.findByName("John"));
	}

}
