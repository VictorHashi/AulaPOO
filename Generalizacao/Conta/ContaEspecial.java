package POOGeneralizacao.Conta;

public class ContaEspecial extends Conta{

    private int diasSemJuros;
    private double limite;

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, int diasSemJuros, double limite) {
        super(banco, agencia, numeroConta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    public ContaEspecial() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaEspecial{");
        sb.append("diasSemJuros=").append(diasSemJuros);
        sb.append(", limite=").append(limite);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
