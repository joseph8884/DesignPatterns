package primer_ejercicio;

public class SmartWatch implements Dispositivo {
    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje enviado desde un smartwatch");
    }
}
