package POOGeneralizacao.Item;

public class VHS extends Midia{

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public VHS(int codigo, String descricao, String gravadora, String duracao, String titulo) {
        super(codigo, descricao, gravadora, duracao);
        this.titulo = titulo;
    }

    public VHS(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VHS{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
