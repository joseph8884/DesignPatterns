package primer_ejercicio;

public class Computador implements Dispositivo {
    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje enviado desde un computador");
    }
}
