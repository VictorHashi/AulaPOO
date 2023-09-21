package POOGeneralizacao.Item;

public class Livro extends Item{

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(int codigo, String descricao, String autor) {
        super(codigo, descricao);
        this.autor = autor;
    }

    public Livro() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("autor='").append(autor).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
