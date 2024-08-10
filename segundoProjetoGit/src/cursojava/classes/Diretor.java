package cursojava.classes;

public class Diretor extends Pessoa {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    @Override
    public double salario() {
        return 3998;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", idade=" + idade +
                ", titulacao='" + titulacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", registroEducacao='" + registroEducacao + '\'' +
                '}';
    }


}
