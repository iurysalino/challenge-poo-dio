package br.com.dio.challenge.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Contents {

    protected static final double DEFAULT_XP = 10d;
    private String title;
    private String description;

    /**
     * This method is responsable to calculate the experience the courses.
     *
     * @return a numerical value that represents the course experience calculated.
     */
    public abstract double calculateXp();
}
