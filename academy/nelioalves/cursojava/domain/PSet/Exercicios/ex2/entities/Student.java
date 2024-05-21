package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicios.ex2.entities;

import java.util.Objects;

public class Student {
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
