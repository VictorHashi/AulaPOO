package POOGeneralizacao.Veiculo;

public class VeiculoMain {

    public static void main(String[] args) {

        Veiculo v = new Veiculo(true);
        Carro car = new Carro(true, 4);
        Moto m = new Moto(true, 600);
        Caminhao cam = new Caminhao(true, 5);

        System.out.println(v.toString());
        System.out.println(car.toString());
        System.out.println(m.toString());
        System.out.println(cam.toString());

    }

}
