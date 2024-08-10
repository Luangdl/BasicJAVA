package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {

        double[] notas = {8.8,9.7,7.6,6.8};
        double[] notasLogica = {8.7,9.6,5.2,8.5};

        //Criação do aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Alex Fernando Egidio");
        aluno.setNomeEscola("EE das quantas");

        //Criacao da disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de programacao");
        disciplina2.setNota(notasLogica);

        aluno.getDisciplinas().add(disciplina2);





    }

}
