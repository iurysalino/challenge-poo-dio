package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentory extends Contents {

    private LocalDate date;

    public Mentory(String title, String description, LocalDate date) {
        this.setTitle(title);
        this.setDescription(description);
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentory{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
