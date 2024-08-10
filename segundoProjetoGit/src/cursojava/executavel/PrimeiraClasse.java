package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasse {

        public static void main(String[] args) {

                try {

                        String login = JOptionPane.showInputDialog("Informe o login");
                        String senha = JOptionPane.showInputDialog("Informe a senha");

                        PermitirAcesso permitirAcesso = new Secretario(login, senha);

                        if (permitirAcesso.autenticar()) {


                                List<Aluno> alunos = new ArrayList<Aluno>();

                                for (int qtd = 1; qtd <= 2; qtd++) {

                                        String nome = JOptionPane.showInputDialog("Qual nome do aluno?" + qtd + "?");
                                        String idade = JOptionPane.showInputDialog("Qual idade do aluno");

                                        Aluno aluno1 = new Aluno();

                                        aluno1.setNome(nome);
                                        aluno1.setIdade(Integer.valueOf(idade));

                                        for (int posicao = 1; posicao <= 1; posicao++) {
                                                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + posicao + "?");
                                                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + posicao + "?");

                                                Disciplina disciplina = new Disciplina();
                                                disciplina.setDisciplina(nomeDisciplina);
          //                                      disciplina.setNota(Double.parseDouble(notaDisciplina));

                                                aluno1.getDisciplinas().add(disciplina);

                                        }

                                        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

                                        if (escolha == 0) { /*Opcao sim é zero*/
                                                int continuarRemover = 0;
                                                int posicao = 1;

                                                while (continuarRemover == 0) {
                                                        String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
                                                        aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                                                        posicao++;
                                                        continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
                                                }
                                        }
                                        alunos.add(aluno1);

                                        for (int pos = 0; pos < alunos.size(); pos++) {

                                                Aluno aluno = alunos.get(pos);

                                                System.out.println("Aluno = " + aluno.getNome());
                                                System.out.println("Média do Aluno = " + aluno.getMediaNota());
                                                System.out.println("resultado = " + aluno.getAlunoAprovado2());
                                                System.out.println("------------------------------------------");

                                        }

                                }

                        } else {
                                JOptionPane.showMessageDialog(null, "nao foi liberado acesso");
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro inesperado" + e.getClass().getName());

                } finally {
                        JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
                }
        }
}