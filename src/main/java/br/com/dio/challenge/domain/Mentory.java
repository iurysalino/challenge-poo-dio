package br.com.dio.challenge.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "Mentory{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
