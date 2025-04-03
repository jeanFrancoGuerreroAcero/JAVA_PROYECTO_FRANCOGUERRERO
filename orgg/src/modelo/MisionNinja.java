package orgg.src.modelo;

public class MisionNinja {
    int id;
    String fechaInicio;
    String fechaFin;
    int estado;
    int id_nija;
    int id_mision;
    String descripcion;

    public MisionNinja(int id, String fechaInicio, String fechaFin, int estado, int id_nija, int id_mision) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.id_nija = id_nija;
        this.id_mision = id_mision;
    }

    public MisionNinja(int estado, String fechaFin, String descripcion) {
        this.estado = estado;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_nija() {
        return id_nija;
    }

    public void setId_nija(int id_nija) {
        this.id_nija = id_nija;
    }

    public int getId_mision() {
        return id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    @Override
    public String toString() {
        return "mision terminada: "+ " " +"fechaFin: " + fechaFin + " " + "Descripcion: " + descripcion ;
    }
}
