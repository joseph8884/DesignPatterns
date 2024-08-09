package quinto_ejercicio;

public class WineDecorator extends RoomDecorator{
    public WineDecorator(IRoom wrapped) {
        super(wrapped);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 300;
    }

    @Override
    public String description() {
        return super.description() + ", con vino";
    }
}
