package tercer_ejercicio;

public class Main {
    public static void main(String[] args) {
        int precioTotal = 0;
        Order orderFood = new OrderFood();
        Order orderBeverage = new OrderBeverage();
        Order orderDessert = new OrderDessert();

        precioTotal = precioTotal + orderFood.recivingOrder();
        precioTotal = precioTotal+ orderBeverage.recivingOrder();
        precioTotal = precioTotal + orderDessert.recivingOrder();

        System.out.println("Total: $" + precioTotal);
    }
}
