package tercer_ejercicio;

import java.util.Random;

public abstract class Order {
    abstract void takeOrder();
    abstract void prepareOrder();
    abstract int calculatePrice();

    public boolean checkAvailability(){
        Random random =  new Random();
        boolean disponibilidad = random.nextBoolean();
        System.out.println("Disponibilidad: " + disponibilidad);
        return disponibilidad;
    }

    //Template Method
    public int recivingOrder() {
        takeOrder();
        if (checkAvailability()){
            prepareOrder();
            return calculatePrice();
        }
        System.out.println("-------------------------");
        return 0;
    }
}
