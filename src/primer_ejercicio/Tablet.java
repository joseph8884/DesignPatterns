package primer_ejercicio;

public class Tablet implements Dispositivo {
    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje enviado desde una tablet");
    }
}
