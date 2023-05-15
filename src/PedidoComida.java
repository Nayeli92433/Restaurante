public class PedidoComida {
    private int numPedido;
    private String alimento;
    private int cantAlimento;
    private String observaciones;
    private double precio;

    public PedidoComida(int numPedido, String alimento, int cantAlimento, String observaciones, double precio) {
        this.numPedido = numPedido;
        this.alimento = alimento;
        this.cantAlimento = cantAlimento;
        this.observaciones = observaciones;
        this.precio=precio;
    }


}
