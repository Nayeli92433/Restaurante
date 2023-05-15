public class CalcularTotal {
    public double calcularComida(int cantidad, double precio){
        double total=0;
        total=cantidad*precio;
        return total;
    }

    public double calcularBebida(String cantidad, double precio){
        double total=0;
        if (cantidad.equals("copa")){
            total=precio/5;
        }
        else if (cantidad.equals("litro")){
            total=precio;
        }
        return total;
    }
}
