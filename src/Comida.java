public class Comida {
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;

    public Comida(int id, String nombre, String descripcion, int precio) {
        this.id= id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

}
