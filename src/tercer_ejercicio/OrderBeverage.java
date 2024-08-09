package tercer_ejercicio;

import java.util.Random;

public class OrderBeverage extends Order{

    @Override
    void takeOrder() {
        System.out.println("Tomando orden de bebida");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparando bebida...");
    }

    @Override
    int calculatePrice() {
        Random random = new Random();
        int precioBebida = (3000 + random.nextInt(15000));
        System.out.println("Precio bebida: $" + precioBebida + "\n-----------------------");
        return precioBebida;
    }
}
