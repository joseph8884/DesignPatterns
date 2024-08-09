package segundo_ejercicio;

public class Telefono implements Dispositivo {
    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje enviado desde un teléfono");
    }
}
