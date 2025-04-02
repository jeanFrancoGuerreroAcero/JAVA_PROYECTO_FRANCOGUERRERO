package orgg.src.modelo;

public class habilidad {
    int id;
    String nombre;
    String descripcion;
    int id_ninja;

    public habilidad(int id, String nombre, String descripcion, int id_ninja) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_ninja = id_ninja;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }
}
