package primer_ejercicio;

import java.util.ArrayList;

public class Notificador {
    private ArrayList<Dispositivo> dispositivos;

    public Notificador(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }
    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }
    public void eliminarDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }
    public void notificarDispositivos() {
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.enviarMensaje();
        }
    }
}
