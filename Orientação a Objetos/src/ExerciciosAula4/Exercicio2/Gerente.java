package ExerciciosAula4.Exercicio2;

import java.util.List;

public class Gerente extends Funcionario{

    public Gerente(String nome, String email, String password) {
        super(nome, email, password);
        this.setAdmin(true);
    }

    public void relatorioFinanceiro(){
        System.out.println("Gerando Relatorio Financeiro...");
    }

    public void consultarVendas(List<Vendedor> vendedores){
        System.out.println("Consultando vendas dos vendedores:");
        for (Vendedor vendedor : vendedores) {
            System.out.println("Vendedor: " + vendedor.getNome() + " - Vendas: " + vendedor.getQtdVendas());
        }
    }
}
