package POOGeneralizacao.Conta;

import java.util.Date;

public class ContaSimples extends Conta{

    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca) {
        super(banco, agencia, numeroConta, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public ContaSimples() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaSimples{");
        sb.append("saldoPoupanca=").append(saldoPoupanca);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public void depositoPoupanca(Double value){
        if (value < 0){
            setSaldoPoupanca(getSaldoPoupanca()+value);
            System.out.println("Deposito efetuado");
        } else
            System.out.println("Apenas valores positivos");
    }

    public void saquePoupanca(Double value){
        if (value < 0)
            if (value >= getSaldoPoupanca()) {
                setSaldoPoupanca(getSaldoPoupanca() - value);
                System.out.println("Saque efetuado");
            }else
                System.out.println("Saldo insuficiente");
        else
            System.out.println("Apenas valores positivos");
    }

}
