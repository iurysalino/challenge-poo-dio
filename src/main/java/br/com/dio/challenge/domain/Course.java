package br.com.dio.challenge.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course extends Contents {

    private int workLoad;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
