public interface InterfaceConta {

    void sacar(double valor);

    void transferir(double valor, Conta destino);

    void depositar(double valor);

    void imprimirExtrato();
}
