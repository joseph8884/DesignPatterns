package tercer_ejercicio;

import java.util.Random;

public class OrderFood extends Order{

    @Override
    void takeOrder() {
        System.out.println("Tomando orden de comida");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparando comida...");
    }

    @Override
    int calculatePrice() {
        Random random = new Random();
        int precioComida = (20000 + random.nextInt(50000));
        System.out.println("Precio comida: $" + precioComida + "\n-----------------------");
        return precioComida;
    }
}
