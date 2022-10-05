package br.com.dio.challenge.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finishDate = initialDate.plusDays(45);
    private Set<Developer> developersSubscribeds = new HashSet<>();
    private Set<Contents> contents = new LinkedHashSet<>();
}
