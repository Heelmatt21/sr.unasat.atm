package app;

import services.ATMService;

public class Application {
    public static void main(String[] args) {
        ATMService as = new ATMService(3000);
        as.snelkasgebruiken(50);
    }
}
