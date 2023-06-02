public class CPoupanca extends Conta{

    public CPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=======EXTRATO CONTA POUPANÇA=======");
        super.imprimirinfoscomuns();
    }
}
