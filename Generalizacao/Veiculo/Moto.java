package POOGeneralizacao.Veiculo;

public class Moto extends Veiculo{

    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(boolean motor, int cilindradas) {
        super(motor);
        this.cilindradas = cilindradas;
    }

    private Moto(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Moto{");
        sb.append("cilindradas=").append(cilindradas);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
