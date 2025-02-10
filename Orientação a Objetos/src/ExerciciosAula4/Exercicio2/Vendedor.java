package ExerciciosAula4.Exercicio2;

public class Vendedor extends Funcionario{
    private int qtdVendas;

    public Vendedor(String nome, String email, String password) {
        super(nome, email, password);
        this.setAdmin(false);
        this.qtdVendas = 0;
    }

    public void realizarVenda(int quantidade){
        this.qtdVendas += quantidade;
    }

    public void consultarVendas(){
        System.out.println("Quantidade de vendas efetuadas: " + this.qtdVendas);
    }

    public int getQtdVendas() {
        return qtdVendas;
    }
}
