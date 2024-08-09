package quinto_ejercicio;

public class FlowerDecorator extends RoomDecorator{
    public FlowerDecorator(IRoom wrapped) {
        super(wrapped);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 100;
    }

    @Override
    public String description() {
        return super.description() + ", con flores";
    }
}
