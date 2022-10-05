package br.com.dio.challenge;

import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Developer;
import br.com.dio.challenge.domain.Mentory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Course One");
        course.setDescription("Course about Java 1");
        course.setWorkLoad(4);

        Course course2 = new Course();
        course2.setTitle("Course Two");
        course2.setDescription("Course about Java 2");
        course2.setWorkLoad(4);

        Mentory mentory = new Mentory("Iury Salino", "Dev Backend Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentory);

        Developer developer1 = new Developer();
        developer1.setName("Developer One");
        developer1.subscribeBootcamp(bootcamp);
        developer1.progress();
        developer1.progress();
        developer1.progress();
        System.out.println("Sobscribes Contents: " + developer1.getContentsSubcribed());
        System.out.println("Finished Contents: " + developer1.getContentsFinished());
        System.out.println("XP: " + developer1.calculeteTotalExperience());

        Developer developer2 = new Developer();
        developer2.setName("Developer Two");
        System.out.println("Sobscribes Contents: " + developer2.getContentsSubcribed());
        System.out.println("Finished Contents: " + developer2.getContentsFinished());

    }
}
