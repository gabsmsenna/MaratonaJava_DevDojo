package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap.Ex002.entities;

import java.util.Comparator;
import java.util.Objects;

public class Candidate {

    private String name;

    public Candidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidate candidate)) return false;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Candidate:" +
                 name;
    }
}
