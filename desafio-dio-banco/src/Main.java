public class Main {
    public static void main(String[] args) {
       Banco banco = new Banco();
       Cliente cl1 = new Cliente("teo");
       Cliente cl2 = new Cliente("maria");

       
       banco.adicionarClientes(cl1);
       banco.adicionarClientes(cl2);

       Conta cc = new ContaCorrente(cl1);
       Conta poupanca = new ContaPoupanca(cl2);
       
       banco.adicionarConta(cc);
       banco.adicionarConta(poupanca);

       banco.depositar(poupanca, 100);
       banco.depositar(cc, 100);

       banco.imprimirClientes();

       banco.trasferir(cc, poupanca, 50);

       banco.imprimirExtrato(poupanca);
       banco.imprimirExtrato(cc);

       
       



    }
}
