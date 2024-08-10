package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Secretario() {

    }


    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getRegistro() {
        return registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    @Override
    public double salario() {
        return 0;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }


}
