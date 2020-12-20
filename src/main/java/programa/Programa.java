package programa;

import entidade.Conta;
import entidade.ContaEmpresa;
import entidade.ContaPoupanca;

public class Programa {

    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Eduardo", 0.0);
        ContaEmpresa contaEmpresa = new ContaEmpresa(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Conta conta1 = contaEmpresa;
        Conta conta2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
        Conta conta3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);



        //DOWNCASTING
        ContaEmpresa contaEmpresa4 = (ContaEmpresa) conta2;
        contaEmpresa4.emprestimo(100.0);


        //OVERRIDE
        Conta conta5 = new Conta(1008, "Eduardo", 1000.0);
        conta5.saque(200.0);
        System.out.println(conta5.getSaldo());

        Conta conta6 = new ContaPoupanca(1009, "Maria", 1000.0, 0.01);
        conta6.saque(200.0);
        System.out.println(conta6.getSaldo());

        Conta conta7 = new ContaEmpresa(1010, "Igor", 1000.0, 500.0);
        conta7.saque(200.0);
        System.out.println(conta7.getSaldo());
    }
}
