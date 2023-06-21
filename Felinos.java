public class Felinos {
    Double mide;
    String tipo_E;
    String color;
    Double peso;

    public Felinos (Double mide, String tipo_E,String color,Double peso){
        this.color=color;
        this.peso=peso;
        this.mide=mide;
        this.tipo_E=tipo_E;
    }

    public Double getMide() {
        return mide;
    }

    public void setMide(Double mide) {
        this.mide = mide;
    }

    public String getTipo_E() {
        return tipo_E;
    }

    public void setTipo_E(String tipo_E) {
        this.tipo_E = tipo_E;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    }

