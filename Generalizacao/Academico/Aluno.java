package POOGeneralizacao.Academico;

public class Aluno extends Pessoa{

    private int matrícula;

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public Aluno(int codigo, String nome, String endereco, int matrícula) {
        super(codigo, nome, endereco);
        this.matrícula = matrícula;
    }

    public Aluno(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("matrícula=").append(matrícula);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
