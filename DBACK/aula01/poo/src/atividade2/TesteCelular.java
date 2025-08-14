package atv;

public class TesteCelular {

    public static void main(String[] args) {

        Celular cel = new Celular();

        System.out.println(cel.mostrarModelo("M32"));
        System.out.println("Custando " + cel.verPreco(999.90));
        System.out.println("Preço em 12x: " + cel.precoCartao());


    }
}
