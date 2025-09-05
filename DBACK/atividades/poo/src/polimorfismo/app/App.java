package polimorfismo.app;

import polimorfismo.Conta;
import polimorfismo.ContaEmpresa;
import polimorfismo.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1010, 300, "Gustavo");
        conta.getSaldo();
        ContaEmpresa contaEmpresa = new ContaEmpresa(
            4010, 
            3000, 
            "Auro", 
            400000);

            //UPCASTING calsse filha virando pai

        Conta c1 = contaEmpresa;
        c1.getClass();
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
        c3.getClass();
        //DOWNCASTING

        //ContaEmpresa ce1 = conta;
        // ContaEmpresa ce2 = (ContaEmpresa) conta;
        ContaEmpresa c4 = (ContaEmpresa) c2;
        c4.getClass();

        if(c2 instanceof ContaEmpresa){
            ContaEmpresa ce4 = (ContaEmpresa) c2;   
            ce4.getClass();
        }

    }




   

    
    


}
