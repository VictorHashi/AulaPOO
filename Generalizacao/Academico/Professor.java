package POOGeneralizacao.Academico;

public class Professor extends Pessoa{

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(int codigo, String nome, String endereco, String disciplina) {
        super(codigo, nome, endereco);
        this.disciplina = disciplina;
    }

    public Professor(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professor{");
        sb.append("disciplina='").append(disciplina).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
