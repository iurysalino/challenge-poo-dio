package br.com.dio.challenge;

import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Course One");
        course.setDescription("Course about Java 1");
        course.setWorkLoad(2);

        Mentory mentory = new Mentory("Iury Salino", "Dev Backend Java", LocalDate.now());

        System.out.println(course.getTitle() + "\n" + course.getDescription() + "\n" + course.getWorkLoad() + " hours");
        System.out.println("Mentor: " + mentory.getTitle() + "\n" + "Description: "+ mentory.getDescription()+ "\n" +"Date: " + mentory.getDate());
    }
}
