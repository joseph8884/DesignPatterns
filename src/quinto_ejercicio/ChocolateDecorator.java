package quinto_ejercicio;

public class ChocolateDecorator extends RoomDecorator{
    public ChocolateDecorator(IRoom wrapped) {
        super(wrapped);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 50;
    }

    @Override
    public String description() {
        return super.description() + ", con chocolates";
    }
}
