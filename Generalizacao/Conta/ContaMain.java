package POOGeneralizacao.Conta;

public class ContaMain {

    public static void main(String[] args) {
        Conta c = new Conta("BB",1000,9999, 159.65);
        ContaSimples cs = new ContaSimples("BancoI",9999,1111,9345,5000.3);
        ContaEspecial ce = new ContaEspecial("BancoII",5555,4444,34.8,30,10000);

        System.out.println(c.toString());
        System.out.println(cs.toString());
        System.out.println(ce.toString());

    }
    
}
