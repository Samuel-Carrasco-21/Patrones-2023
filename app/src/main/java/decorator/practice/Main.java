package decorator.practice;

public class Main {
    public static void main(String[] args) {
        Minibus minibus = new Minibus(10, "toyota", 2000);
        Taxi taxi = new Taxi("1243AFB", "ford", 1000);
        Vagoneta vagoneta = new Vagoneta(300, "suzuki", 3000);

        Turbo t1 = 
        new Turbo(minibus, "Turbo Mini Bus");
        GPS g1 = 
        new GPS(minibus, "GPS Minu Bus");
        TanqueGas ta1 = 
        new TanqueGas(minibus, "Tanque Mini Bus", 10);

        TanqueGas ta2 = 
        new TanqueGas(taxi, "Tanque Taxi", 20);

        Turbo t3 = 
        new Turbo(vagoneta, "Turbo Vagoneta");
        GPS g3 =
        new GPS(vagoneta, "GPS Vagoneta");

        minibus.agregarAccesorio(t1);
        minibus.agregarAccesorio(g1);
        minibus.agregarAccesorio(ta1);

        taxi.agregarAccesorio(ta2);

        vagoneta.agregarAccesorio(t3);
        vagoneta.agregarAccesorio(g3);

        for(int i=0;i<3;i++){
            System.out.println("\n\n+++++++++++++++++++++++");
            minibus.escogerAccion(i);
            System.out.println("+++++++++++++++++++++++");
            taxi.escogerAccion(i);
            System.out.println("+++++++++++++++++++++++");
            vagoneta.escogerAccion(i);
            System.out.println("+++++++++++++++++++++++\n\n");
        }
        
    }
}
