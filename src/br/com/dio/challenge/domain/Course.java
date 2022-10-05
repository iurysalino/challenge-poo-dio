package br.com.dio.challenge.domain;

public class Course extends Contents {

    private int workLoad;

    public Course() {
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workLoad;
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
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
