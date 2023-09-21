package POOGeneralizacao.Item;

public class CD extends Midia{

    private int faixas;
    private String artista;
    private String album;

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public CD(int codigo, String descricao, String gravadora, String duracao, int faixas, String artista, String album) {
        super(codigo, descricao, gravadora, duracao);
        this.faixas = faixas;
        this.artista = artista;
        this.album = album;
    }

    public CD() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CD{");
        sb.append("faixas=").append(faixas);
        sb.append(", artista='").append(artista).append('\'');
        sb.append(", album='").append(album).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
