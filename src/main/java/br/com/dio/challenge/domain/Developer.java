package br.com.dio.challenge.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Developer {
    private String name;
    private String email;
    private String cpf;
    private Set<Contents> contentsSubcribed = new LinkedHashSet<>();
    private Set<Contents> contentsFinished = new LinkedHashSet<>();

    /**
     * This method is used to subscribed that a Bootcamp.
     *
     * @param bootcamp is the required param to subscribe.
     */
    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.contentsSubcribed.addAll(bootcamp.getContents());
        bootcamp.getDevelopersSubscribeds().add(this);
    }

    /**
     * This method is used to progress at the Courses into Bootcamp.
     */
    public void progress() {
        Optional<Contents> contents = this.contentsSubcribed.stream().findFirst();
        if (contents.isPresent()) {
            this.contentsFinished.add(contents.get());
            this.contentsSubcribed.remove(contents.get());
        } else {
            System.err.println("You are not subscribed to any contents!");
        }
    }

    /**
     * This method is used to calculate the total experience obtained into progress.
     *
     * @return a numerical value that represents the total experience obtained.
     */
    public double calculeteTotalExperience() {
        return this.contentsFinished
                .stream()
                .mapToDouble(Contents::calculateXp)
                .sum();
    }
}
