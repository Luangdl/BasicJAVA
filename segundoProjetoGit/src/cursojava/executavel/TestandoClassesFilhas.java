package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;

public class TestandoClassesFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Luan - Treinamento");
        aluno.setNumeroCpf("121211212");
        aluno.setIdade(17);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("2121511515vdv");
        diretor.setNome("Edigio");
        diretor.setIdade(25);

        System.out.println(aluno);
        System.out.println(diretor);

    }

}
