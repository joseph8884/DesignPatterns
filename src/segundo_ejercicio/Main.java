package segundo_ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
        Tablet tablet = new Tablet();
        dispositivos.add(new Computador());
        dispositivos.add(tablet);
        dispositivos.add(new SmartWatch());

        Notificador notificador = new Notificador(dispositivos);
        //notificador.notificarDispositivos();
        notificador.agregarDispositivo(new Telefono());
        notificador.notificarDispositivos();
    }
}
