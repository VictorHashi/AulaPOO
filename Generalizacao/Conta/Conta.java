package POOGeneralizacao.Conta;

public class Conta {

    private String banco;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String banco, int agencia, int numeroConta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Conta(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("banco='").append(banco).append('\'');
        sb.append(", agencia=").append(agencia);
        sb.append(", numeroConta=").append(numeroConta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void deposito(Double value){
        if (value < 0) {
            setSaldo(getSaldo() + value);
            System.out.println("Deposito efetuado");
        }else
            System.out.println("Depósito apenas para valores positivos");
    }

    public void saque(Double value){
        if (value < 0)
            if (value <= saldo) {
                setSaldo(getSaldo() - value);
                System.out.println("Saque efetuado");
            } else
                System.out.println("Sem saldo suficiente");
        else
            System.out.println("Saque apenas para valores positivos");
    }


}
