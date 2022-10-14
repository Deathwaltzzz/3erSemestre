public class Vuelo {
    //Leonardo Contreras Martinez
    private String ciudadOrigen;
    private String ciudadDestino;
    private float precio;
    public Vuelo(String ciudadOrigen, String ciudadDestino, float precio){
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String toString() {
        return "\nciudadOrigen= " + ciudadOrigen + "\n" +
                "ciudadDestino= " + ciudadDestino + "\n" +
                "precio: " + precio + "\n";
    }
}
