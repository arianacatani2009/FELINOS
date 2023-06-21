public class Serval extends Felinos{
    String nombre;
    String habilidad;

    public Serval(String nombre, String habilidad,Double mide, String tipo_E, String color, Double peso) {
        super(mide, tipo_E, color, peso);
        this.nombre=nombre;
        this.habilidad=habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
