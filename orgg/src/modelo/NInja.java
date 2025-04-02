package orgg.src.modelo;

public class NInja {
    int id;
    String nombre;
    String Rango;
    String aldea;
    String habilidad;

    public NInja(String nombre, String rango, String aldea, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.Rango = rango;
        this.aldea = aldea;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String rango) {
        Rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }


    @Override
    public String toString() {
        return "" +
                "" + nombre + '\'' +
                "" + Rango + '\'' +
                "" + aldea + '\'' +
                "" + habilidad + '\'' +
                '}';
    }
}
