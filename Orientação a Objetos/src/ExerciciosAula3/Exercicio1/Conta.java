package ExerciciosAula3.Exercicio1;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private boolean chequeEspecialUsado;
    private double divida;

    public Conta(double saldo){
        this.saldo = saldo;
        if(saldo <= 500){
            this.chequeEspecial = 50.00;
        }
        else{
            this.chequeEspecial = (0.5 * saldo);
        }
        this.chequeEspecialUsado = false;
        this.divida = 0.00;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void depositarDinheiro(double valor) {
        this.saldo += valor;

        if(this.divida > 0){
            double pagamento = Math.min(this.saldo, this.divida);
            this.saldo -= pagamento;
            this.divida -= pagamento;
        }

        if(this.divida == 0)
            this.chequeEspecialUsado = false;

        System.out.println("Depósito realizado. Saldo atual: " + this.saldo);
        System.out.println("Dívida restante: " + this.divida);
    }

    public void sacarDinheiro(double saque) {
        if(this.saldo < saque){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.saldo -= saque;
            System.out.println("Seu saldo Atual é de " + this.saldo);
        }
    }

    public void pagarBoleto(double valor) {
        if(this.saldo < valor){
            if(this.chequeEspecial < (this.saldo - valor)){
                System.out.println("Saldo insuficiente");
            }
            else{
                calcularDivida(valor);
                this.chequeEspecialUsado = true;
                this.saldo = 0;

                System.out.println("Seu saldo Atual é de " + this.saldo);
                System.out.println("Seu Cheque Especial Atual é de " + this.chequeEspecial);
            }
        }else{
            this.saldo -= valor;
            System.out.println("Seu saldo Atual é de " + this.saldo);
            System.out.println("Seu Cheque Especial Atual é de " + this.chequeEspecial);
        }
    }

    public void verificarCheque() {
        if(chequeEspecialUsado){
            System.out.println("Cheque Especial esta sendo Usado");
        }
        else{
            System.out.println("Cheque Especial esta não sendo Usado");
        }
    }

    private void calcularDivida(double valor){
        this.divida += (valor - this.saldo);
        this.chequeEspecial -= (valor - this.saldo);
        if(this.chequeEspecial == 0){
            this.divida += (1.2 * divida);
        }
    }
}
