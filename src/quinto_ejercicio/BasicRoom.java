package quinto_ejercicio;

public class BasicRoom implements IRoom{

    @Override
    public int calculatePrice() {
        return 200;
    }

    @Override
    public String description() {
        return "Habitacion basica";
    }
}
