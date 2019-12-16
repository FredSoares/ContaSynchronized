public class VisaFlex {
    private int saldo = 10000;

    public synchronized void levantarSaldo(int valor, String client) throws InterruptedException {
        int saldoInicial = saldo;

        if (this.saldo >= valor){

            Thread.sleep(1000);
            this.saldo -= valor;
            System.out.println(client +" levatou " + valor +
                    " SALDO INICIAL "+ saldoInicial+
                    " SALDO FINAL "+ saldo);
        }else {
            System.err.println("Saldo insuficiente " + this.saldo);
        }
    }
}
