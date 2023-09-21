package POOGeneralizacao.Veiculo;

public class Caminhao extends Veiculo{

    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(boolean motor, int eixos) {
        super(motor);
        this.eixos = eixos;
    }

    public Caminhao(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caminhao{");
        sb.append("eixos=").append(eixos);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
