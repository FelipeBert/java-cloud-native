package ExerciciosAula4.Exercicio1;

public class Teste {
    public static void main(String[] args) {
        MeiaEntrada meiaEntrada = new MeiaEntrada();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();

        meiaEntrada.setValor(50);
        meiaEntrada.setNome("Star Wars");
        meiaEntrada.setTipo("Legendado");

        ingressoFamilia.setValor(100);
        ingressoFamilia.setNome("The Greatest of the Show");
        ingressoFamilia.setTipo("Dublado");
        ingressoFamilia.setQtdPessoas(10);

        System.out.println(meiaEntrada.valorIngresso());
        System.out.println(ingressoFamilia.valorIngresso());
    }
}
