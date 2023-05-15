public class Bebida {
    private static int cont=0;
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    public Bebida(String nombre, String descripcion, int precio) {
        this.id= cont++;
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
