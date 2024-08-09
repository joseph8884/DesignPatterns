package quinto_ejercicio;

public class RoomDecorator implements IRoom{
    private final IRoom wrapped;

    public RoomDecorator(IRoom room) {
        this.wrapped = room;
    }

    @Override
    public int calculatePrice() {
        return wrapped.calculatePrice();
    }

    @Override
    public String description() {
        return wrapped.description();
    }
}
