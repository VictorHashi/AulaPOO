package POOGeneralizacao.Pessoa;

public class PessoaMain {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Abc","Rua 1");
        Pessoa pf = new PessoaFisica("Bcd","Rua 2","123.456.789-01","Solteiro");
        Pessoa pj = new PessoaJuridica("Cde","Rua 3","01.234.567/0001-89","Publica");

        System.out.println(p.toString());
        System.out.println(pf.toString());
        System.out.println(pj.toString());

    }

}
