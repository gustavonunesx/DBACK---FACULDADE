package polimorfismo.app;

import polimorfismo.Conta;
import polimorfismo.ContaEmpresa;
import polimorfismo.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1010, 300, "Gustavo");

        ContaEmpresa contaEmpresa = new ContaEmpresa(
            4010, 
            3000, 
            "Auro", 
            400000);

             //UPCASTING calsse filha virando pai

            Conta c1 = contaEmpresa;
            Conta c2 = new ContaEmpresa(
                2910, 
                330,
                "Astolpgho",
                231);

            Conta c3 = new ContaPoupanca(
                532,
                1112,
                "Javalesco", 
                0.05);

            //DOWNCASTING

            //ContaEmpresa ce1 = conta;
    }




   

    
    


}
