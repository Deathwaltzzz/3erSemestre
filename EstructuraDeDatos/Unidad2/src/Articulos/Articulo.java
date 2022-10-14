package Articulos;

public class Articulo {
    private String descripcion;
    private int cantidad;
    private float precio;

    public Articulo(String descripcion, int cantidad, float precio){
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String toString(){
        return "\nDescripcion: " +  descripcion + "\nCantidad: " + cantidad + "\nPrecio: " + precio;
    }
}
