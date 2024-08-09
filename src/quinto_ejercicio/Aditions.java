package quinto_ejercicio;

public class Aditions {
    public void typeRoom(boolean chocolate, boolean flowers, boolean wine) {
        IRoom roomBasic = new BasicRoom();
        if (chocolate) {
            roomBasic = new ChocolateDecorator(roomBasic);
        }
        if (flowers) {
            roomBasic = new FlowerDecorator(roomBasic);
        }
        if (wine) {
            roomBasic = new WineDecorator(roomBasic);
        }

        System.out.println(roomBasic.description() + "\nPrecio: $" + roomBasic.calculatePrice());
    }
}
