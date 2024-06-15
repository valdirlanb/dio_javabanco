public class Main {
    public static void main(String[] args) {
        Cliente luke = new Cliente();
        luke.setNome("Luke");


        Conta cc = new ContaCorrente(luke);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(luke);
        cc.transferir(100, poupanca);

        cc.imprimiExtrato();
        poupanca.imprimiExtrato();
    }
}
