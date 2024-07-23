
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Marcelo");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        corrente.depositar(25);
        corrente.transferir(10,poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
