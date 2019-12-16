public class Client implements Runnable{
    private VisaFlex visaFlex;

    public Client(VisaFlex visaFlex) {
        this.visaFlex = visaFlex;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5 ; i++) {
            // pegar nome da thread current
            String name = Thread.currentThread().getName();

            try {
                // efetuar levantamento
                this.visaFlex.levantarSaldo(1000, name);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
