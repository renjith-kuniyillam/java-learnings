package com.advancedjpa.demo;

import com.advancedjpa.demo.entity.Author;
import com.advancedjpa.demo.entity.Course;
import com.advancedjpa.demo.entity.Video;
import com.advancedjpa.demo.repositories.AuthorRepository;
import com.advancedjpa.demo.repositories.CourseRepository;
import com.advancedjpa.demo.repositories.VideoRepository;
import com.advancedjpa.demo.sepecification.AuthorSpecification;
import com.advancedjpa.demo.services.AuthorService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository, AuthorService authorService) {
		return args -> {
			// Inserting 50 authors
//			for(int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(19,60))
//						.email("email" + i + "@gmail.com")
//						.build();
//				authorRepository.save(author);
//			}

//			for(int i = 0; i < 5; i++) {
//				Faker faker = new Faker();
//				Author author1 = authorRepository.findById(faker.number().numberBetween(1, 50)).get();
//				Author author2 = authorRepository.findById(faker.number().numberBetween(1, 50)).get();
//
//				var course = Course.builder()
//						.title(faker.educator().course())
//						.description(faker.lorem().sentence())
//						.authors(
//								List.of(
//										author1,
//										author2
//								)
//						)
//						.build();
//				courseRepository.save(course);
//			}



			// Inserting and author and a video
			//			var author = Author.builder()
			//					.firstName("John")
			//					.lastName("Doe")
			//					.email("john.doe@gmail.com")
			//					.age(25)
			//					.build();
			//			authorRepository.save(author);
			//			var video = Video.builder()
			//					.name("Introduction to Java")
			//					.url("https://www.youtube.com/watch?v=Qgl_yg2b3P0")
			//					.build();
			//			videoRepository.save(video);

			// Updating author age
			//authorRepository.updateAuthorAge(60, 1);

//			authorRepository.updateAllAge(55);

			//Specification Query

//			Specification<Author> spec = Specification
//					.where(AuthorSpecification.hasAge(35))
//					.and(AuthorSpecification.hasFirstNameContains("Mic"))
//					.and(AuthorSpecification.fetchCourses());
			List<Author> autorList = authorService.getAuthorsByAgeAndFirstName(37, "Jan");
//					authorRepository.findAll(spec);
//					authorRepository.findAll(spec);
			System.out.println(autorList.toString());
//			autorList.forEach(System.out::println);




		};
	}

}
