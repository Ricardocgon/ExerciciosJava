package edu.ricardo.herancas;

public class main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();


        //Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcasts - precisa ser explícito!
        Vendedor vendedor_ = (Vendedor) new Funcionario();


    }
}
