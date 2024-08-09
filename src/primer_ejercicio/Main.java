package primer_ejercicio;

public class Main {
    public static void main(String[] args) {
        Heroe guerrero = new Guerrero("Guerrero", "Visual Appearance", null, 0, 0, 0);
        Heroe mago = new Mago("Mago", "Visual Appearance", null, 0, 0, 0);
        Heroe arquero = new Arquero("Arquero", "Visual Appearance", null, 0, 0, 0);
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);


        Heroe guerreroClonado = guerrero.clone();
        guerreroClonado.setName("Guerrero Clonado");
        System.out.println(guerreroClonado);
    }
}
