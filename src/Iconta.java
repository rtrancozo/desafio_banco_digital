public interface Iconta {


    public void sacar(double valor);
    public void depositar(double valor);
    public void tranferir(double valor, Conta contaDestino);

    public void imprimirExtrato();

}
