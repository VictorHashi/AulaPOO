package POOGeneralizacao.Item;

public class Midia extends Item{

    private String gravadora;
    private String duracao;

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Midia(int codigo, String descricao, String gravadora, String duracao) {
        super(codigo, descricao);
        this.gravadora = gravadora;
        this.duracao = duracao;
    }

    public Midia() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Midia{");
        sb.append("gravadora='").append(gravadora).append('\'');
        sb.append(", duracao='").append(duracao).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
