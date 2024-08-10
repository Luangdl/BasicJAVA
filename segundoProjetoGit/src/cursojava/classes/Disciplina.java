package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

    public double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNotas() {

        double somaTotal = 0;

        for (int pos = 0; pos < nota.length; pos++) {
            somaTotal += nota[pos];
        }

         return somaTotal/4;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.deepEquals(nota, that.nota) && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(nota), disciplina);
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}