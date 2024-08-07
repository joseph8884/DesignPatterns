package primer_ejercicio;

public class Heroe implements Prototype {
    private String nombre;
    private String tipo;
    private String arma;

    public Heroe(String nombre, String tipo, String arma) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.arma = arma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public Prototype clone() {
        return new Heroe(nombre, tipo, arma);
    }

    @Override
    public String toString() {
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", arma='" + arma + '\'' +
                '}';
    }
}
