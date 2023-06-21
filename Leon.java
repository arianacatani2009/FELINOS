public class Leon extends Felinos{
    static String nombre;
    String habilidad;
    public Leon (String nombre, String habilidad, Double mide, String tipo_E,String color,Double peso){
        super(mide,tipo_E,color,peso);
        this.nombre=nombre;
        this.habilidad=habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
