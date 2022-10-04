package br.com.dio.challenge.domain;

public class Course {
    private String title;
    private String description;
    private int workLoad;

    public Course() {}

    public Course(String title, String description, int workLoad) {
        this.title = title;
        this.description = description;
        this.workLoad = workLoad;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
