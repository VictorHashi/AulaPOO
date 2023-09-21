package POOGeneralizacao.Veiculo;

public class Carro extends Veiculo{

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Carro(boolean motor, int portas) {
        super(motor);
        this.portas = portas;
    }

    public Carro(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("portas=").append(portas);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
