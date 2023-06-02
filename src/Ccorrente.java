public class Ccorrente extends Conta {

    public Ccorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=======EXTRATO CONTA CORRENTE=======");
        super.imprimirinfoscomuns();
    }



}

