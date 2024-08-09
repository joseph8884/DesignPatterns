package tercer_ejercicio;

import java.util.Random;

public class OrderDessert extends Order{

    @Override
    void takeOrder() {
        System.out.println("Tomando orden de postre");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparando postre...");
    }

    @Override
    int calculatePrice() {
        Random random = new Random();
        int precioPostre = (7000 + random.nextInt(18000));
        System.out.println("Precio postre: $" + precioPostre + "\n-----------------------");
        return precioPostre;
    }
}
