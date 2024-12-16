package com.specification.demo;

import com.github.javafaker.Faker;
import com.specification.demo.entity.Address;
import com.specification.demo.entity.Student;
import com.specification.demo.entity.Subject;
import com.specification.demo.repository.AddressRepository;
import com.specification.demo.repository.StudentRepository;
import com.specification.demo.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner dataInitialization(StudentRepository studentRepository,
												SubjectRepository subjectRepository,
												AddressRepository addressRepository) {

		return (args -> {

			for(int i = 0; i < 10; i++) {

				Faker faker = new Faker();


				// Create and save Student
				Student student = Student.builder()
						.name(faker.name().fullName())
						.build();
				Student savedStudent = studentRepository.save(student);
				Address address = addressRepository.save(Address.builder()
						.city(faker.address().city())
						.student(savedStudent)
						.build());


				// Create and save Subjects
				Subject subject1 = subjectRepository.save(Subject.builder()
						.name(faker.educator().course() + " 1")
						.student(savedStudent)
						.build());
				Subject subject2 = subjectRepository.save(Subject.builder()
						.name(faker.educator().course() + " 2")
						.student(savedStudent)
						.build());
			}




		});
	}
}
