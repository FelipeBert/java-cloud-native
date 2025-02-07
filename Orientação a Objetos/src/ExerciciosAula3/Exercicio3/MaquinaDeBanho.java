package ExerciciosAula3.Exercicio3;

public class MaquinaDeBanho {
    private boolean temPetsNaMaquina;
    private boolean banhoDado;
    private int nivelDeAgua;
    private int nivelDeShampoo;

    public MaquinaDeBanho() {
        this.temPetsNaMaquina = false;
        this.banhoDado = false;
        this.nivelDeAgua = 30;
        this.nivelDeShampoo = 10;
    }

    public void darBanhoNoPet() {
        if(this.temPetsNaMaquina && this.nivelDeAgua >= 10 && this.nivelDeShampoo >= 2){
            System.out.println("Dando banho no pet");
            this.banhoDado = true;
            this.nivelDeAgua -= 10;
            this.nivelDeShampoo -= 2;
        }
        else if(this.nivelDeAgua < 10 || this.nivelDeShampoo < 2){
            System.out.println("Abasteca a Maquina");
        }
        else{
            System.out.println("Nao tem pets na maquina");
        }
    }

    public void verificarAgua() {
        System.out.println("Nivel de agua: " + this.nivelDeAgua);
    }

    public void verificarShampoo() {
        System.out.println("Nivel de shampoo: " + this.nivelDeShampoo);
    }

    public boolean verificarPet() {
        if(this.temPetsNaMaquina){
            System.out.println("Tem pets na maquina");
            return true;
        }
        else{
            System.out.println("Maquina esta Vazia");
            return false;
        }
    }

    public void colocarPetNaMaquina() {
        if(verificarPet()){
            System.out.println("Pet ja esta na maquina");
        }
        else{
            System.out.println("Pet colocado na maquina");
            this.temPetsNaMaquina = true;
            this.banhoDado = false;
        }
    }

    public void retirarPetDaMaquina() {
        if(verificarPet()){
            System.out.println("Pet retirado da maquina");
            this.temPetsNaMaquina = false;
        }
        else{
            System.out.println("Pet nao esta na maquina");
        }
    }

    public void abastecerComAgua() {
        if(this.nivelDeAgua == 30){
            System.out.println("Nivel de agua ja esta no maximo");
        }
        else if(this.nivelDeAgua + 2 > 30){
            System.out.println("Nivel de agua ja esta no maximo");
        }
        else{
            this.nivelDeAgua += 2;
            System.out.println("Nivel de agua alterado para: " + (this.nivelDeAgua) );
        }
    }

    public void abastecerComShampoo() {
        if(this.nivelDeShampoo == 10){
            System.out.println("Nivel de shampoo ja esta no maximo");
        }
        else if(this.nivelDeShampoo + 2 > 10){
            System.out.println("Nivel de shampoo ja esta no maximo");
        }
        else{
            this.nivelDeShampoo += 2;
            System.out.println("Nivel de shampoo alterado para: " + (this.nivelDeShampoo) );
        }
    }

    public void limparMaquina() {
        if(verificarPet() && !this.banhoDado){
            System.out.println("Necessario Limpar a Maquina");
            if(this.nivelDeAgua >= 3 && this.nivelDeShampoo >= 1){
                System.out.println("Maquina Limpa");
                this.nivelDeAgua -= 3;
                this.nivelDeShampoo -= 1;
            }
            else{
                System.out.println("Abasteca a Maquina");
            }
        }
        else{
            System.out.println("Maquina ja esta Limpa");
        }
    }
}
