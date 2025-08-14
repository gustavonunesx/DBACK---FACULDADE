package atv;

public class Celular {

    String modelo;
    double preco;
    double precoParcelado;

    public String mostrarModelo(String modelo){
        return "O modelo é " + modelo;
    }

    public double verPreco(double preco){
        this.preco = preco;
        return this.preco;
    }

    public double precoCartao(){
        return preco / 12;
    }


}
