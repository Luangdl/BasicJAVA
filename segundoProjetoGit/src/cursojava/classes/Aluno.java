package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }


    @Override
    public double salario() {
        return 1000;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getIdade() {
        return idade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNotas();
        }

        return somaNotas / disciplinas.size();
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 70) {
            return true;
        } else {
            return false;
        }
    }

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }

        } else {
            return StatusAluno.REPROVADO;
        }
    }

//    @Override
//    public String toString() {
//        return "Aluno{" +
//                "nome='" + nome + '\'' +
//                ", idade=" + idade +
//                ", dataNascimento='" + dataNascimento + '\'' +
//                ", numeroCpf='" + numeroCpf + '\'' +
//                ", disciplinas=" + disciplinas +
//                '}';
//    }
}
