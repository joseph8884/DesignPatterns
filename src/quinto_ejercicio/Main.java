package quinto_ejercicio;

public class Main {
    public static void main(String[] args) {
        Aditions basic = new Aditions();
        basic.typeRoom(false, false, false);

        Aditions chocolate = new Aditions();
        chocolate.typeRoom(true, false, false);

        Aditions chocolateFlowersWine = new Aditions();
        chocolateFlowersWine.typeRoom(true, true, true);
    }
}
