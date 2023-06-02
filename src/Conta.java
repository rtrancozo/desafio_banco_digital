public abstract class Conta implements Iconta {

    private static int AGENCIA_PADRÃO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected  Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRÃO;
        this.conta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        saldo-=valor;
    };
    public void depositar(double valor){
        saldo+=valor;
    };
    public void tranferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);

    };

    protected void imprimirinfoscomuns() {
        System.out.println(String.format("Cliente: %s",this.cliente.getNome(), " - CPF - ", this.cliente.getCpf()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta n: %d", this.conta));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }

    protected void imprimirContas(){
        int x=0;
        while (x<=SEQUENCIAL){
            System.out.println();
        }
    }



    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
