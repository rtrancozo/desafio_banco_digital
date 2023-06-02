import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo Rosa");
        rodrigo.setCpf("0458658325-85");
        Banco bc = new Banco();
        Conta cc = new Ccorrente(rodrigo);
        Conta cp = new CPoupanca(rodrigo);



        cc.depositar(1000);
        cc.tranferir(100, cp);
        cp.imprimirinfoscomuns();
        cc.imprimirinfoscomuns();

    }
}
