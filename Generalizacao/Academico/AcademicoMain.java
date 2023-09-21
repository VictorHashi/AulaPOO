package POOGeneralizacao.Academico;

public class AcademicoMain {

    public static void main(String[] args) {

        Pessoa p = new Pessoa(1,"Arlo","Rua 1");
        Aluno a = new Aluno(2,"Beto","Rua 2",1);
        Professor pr = new Professor(3,"Carlo", "Rua 3","Matemática");

        System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(pr.toString());

    }

}
