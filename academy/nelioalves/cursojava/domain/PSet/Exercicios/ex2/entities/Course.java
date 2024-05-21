package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicios.ex2.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Course {
    int[] idalunos;

    public Course(int[] idalunos) {
        this.idalunos = idalunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.deepEquals(idalunos, course.idalunos);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(idalunos);
    }
}
