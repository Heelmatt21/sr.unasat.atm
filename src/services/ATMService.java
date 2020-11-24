package services;


public class ATMService {
    private static Integer[] snelkasopties= {50, 100, 200,400,600,800,1000 };
    private double saldo;
    public ATMService(double saldo){
        this.saldo = saldo;
    }

    public void snelkasgebruiken(int chosenAmount) {



        String message = "Haal uw geld uit het cashvak. U heeft gekozen voor de optie:";
        switch (chosenAmount){
            case 50: message += "SRD" + snelkasopties[0] + ",-";
                break;
            case 100: message += "SRD" + snelkasopties[1] + ",-";
                break;
            case 200: message += "SRD" + snelkasopties[2] + ",-";
                break;
            case 400: message += "SRD" + snelkasopties[3] + ",-";
                break;
            case 600: message += "SRD" + snelkasopties[4] + ",-";
                break;
            case 800: message += "SRD" + snelkasopties[5] + ",-";
                break;
            case 1000: message += "SRD" + snelkasopties[6] + ",-";
                break;
            default: message = "Kies aub uw snelkas bedrag";

        }

        System.out.println(message);
}


}
