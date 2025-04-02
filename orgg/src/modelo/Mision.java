package orgg.src.modelo;

public class Mision {
    int id;
    String descripcion;
    String rando;
    String recompensa;

    public Mision(int id, String descripcion, String rando, String recompensa) {
        this.id = id;
        this.descripcion = descripcion;
        this.rando = rando;
        this.recompensa = recompensa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRando() {
        return rando;
    }

    public void setRando(String rando) {
        this.rando = rando;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
}
