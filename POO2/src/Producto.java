public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, java.lang.String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre=" + nombre + '\'' +
                ", precio=" + precio
                ;
    }
}
