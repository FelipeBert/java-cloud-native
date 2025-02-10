package ExerciciosAula4.Exercicio2;

public abstract class Funcionario {

    private String nome;
    private String email;
    private String password;
    private boolean admin;

    public Funcionario(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public void realizarLogin(String login, String password) {
        if(this.getEmail().equals(login) && this.getPassword().equals(password)){
            System.out.println("Login efetuado com sucesso!");
        }
        else{
            System.out.println("Login ou senha incorretos!");
        }
    }

    public void deslogar() {
        System.out.println("Deslogado com sucesso!");
    }

    public void alterarDados(String nome, String email) {
        if(nome == null && email == null){
            System.out.println("Nenhum dado alterado, envie parametros Validos!");
        } else if (nome != null)  {
            this.setNome(nome);
            System.out.println("Nome alterado com sucesso!");
        }
        else {
            this.setEmail(email);
            System.out.println("Email alterado com sucesso!");
        }
    }

    public void alterarSenha(String senhaAntiga,String novaSenha) {
        if(this.getPassword().equals(senhaAntiga)){
            this.setPassword(novaSenha);
        }
        else{
            System.out.println("Senha antiga incorreta!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
