import java.util.ArrayList;
import java.util.List;

class Banco{
 
  private String nome;
  private List<Conta> contas;
  private List<Cliente> clientes;

    public Banco() {
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarClientes(Cliente cliente) {
        this.clientes.add(cliente);
        
    }
    
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);

    }

    public void imprimirClientes() {
        for(Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
    }

    public void depositar(Conta conta , double valor) {
        conta.depositar(valor);
    }

    public void trasferir(Conta contaIncio, Conta contaDestino, double valor ) {
        contaIncio.trasferir(valor, contaDestino);
    }

    public void imprimirExtrato(Conta conta) {
        conta.imprimirExtrato();
    }
}