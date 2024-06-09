public abstract class Conta implements IConta {
    
    private static  int AGENCIAPADRAO = 1;

    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

   

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIAPADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        
        if(valor <= saldo){
          this.saldo -= valor;  
        } else{
            System.out.println("saldo insuficiente para saque");
        }

        
    }

    @Override
    public void depositar(double valor) {
        
        saldo += valor;
    }

    @Override
    public void trasferir(double valor, Conta contaDestino) {
        if(valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor); 
        } else {
            System.out.println("saldo insuficiente para trasferencia");
        }
        
    }

   
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }

    

   
}
