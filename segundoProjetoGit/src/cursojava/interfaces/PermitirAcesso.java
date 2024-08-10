package cursojava.interfaces;

/*Interface de contrato de autenticacao*/

public interface PermitirAcesso {

    public boolean autenticar();

    public boolean autenticar(String login, String senha);
}
