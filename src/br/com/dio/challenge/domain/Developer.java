package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private String email;
    private String cpf;
    private Set<Contents> contentsSubcribed = new LinkedHashSet<>();
    private Set<Contents> contentsFinished = new LinkedHashSet<>();

    /**
     * This method is used to subscribed that a Bootcamp.
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
     * @return a numerical value that represents the total experience obtained.
     */
    public double calculeteTotalExperience() {
        return this.contentsFinished
                .stream()
                .mapToDouble(Contents::calculateXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Contents> getContentsSubcribed() {
        return contentsSubcribed;
    }

    public void setContentsSubcribed(Set<Contents> contentsSubcribed) {
        this.contentsSubcribed = contentsSubcribed;
    }

    public Set<Contents> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Contents> contentsFinished) {
        this.contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(email, developer.email) && Objects.equals(cpf, developer.cpf) && Objects.equals(contentsSubcribed, developer.contentsSubcribed) && Objects.equals(contentsFinished, developer.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, cpf, contentsSubcribed, contentsFinished);
    }
}
