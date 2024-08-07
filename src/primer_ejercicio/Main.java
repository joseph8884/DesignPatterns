package primer_ejercicio;

public class Main {
    public static void main(String[] args) {
        Heroe guerrero = new Guerrero("Guerrero", "Guerrero", "Espada");
        Heroe mago = new Mago("Mago", "Mago", "Varita");
        Heroe arquero = new Arquero("Arquero", "Arquero", "Arco");

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
        Heroe magoClonado = (Heroe) mago.clone();
        magoClonado.setNombre("MAGOCLONADIO");
        System.out.println(magoClonado);
    }
}
