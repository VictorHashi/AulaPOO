package POOGeneralizacao.Item;

public class ItemMain {

    public static void main(String[] args) {

        Item i = new Item(1,"Item padrão");
        Livro l = new Livro(2,"Livro genérico","Eu");
        Midia m = new Midia(3,"Midia padrão","Grav1","30s");
        CD cd = new CD(4,"CD padrão","Grav2","1h",1,"Eu","Album padrão");
        VHS vhs = new VHS(5,"VHS padrão","Grav3","30min","Fita padrão");

        System.out.println(i.toString());
        System.out.println(l.toString());
        System.out.println(m.toString());
        System.out.println(cd.toString());
        System.out.println(vhs.toString());


    }

}
