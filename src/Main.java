public class Main {

    public static void main(String[] args) {
        VisaFlex visaFlex = new VisaFlex();

        Client c1 = new Client(visaFlex);
        Client c2 = new Client(visaFlex);
        Client c3 = new Client(visaFlex);
        Client c4 = new Client(visaFlex);
        Client c5 = new Client(visaFlex);

        new Thread(c1, "Steven").start();
        new Thread(c2, "Jerry").start();
        new Thread(c3, "Joao").start();
        new Thread(c4, "Warren").start();
        new Thread(c5, "Kelvin").start();

    }
}
