import java.util.Scanner;
public class RegistrarPedido {

    int id;
    Scanner scanner= new Scanner(System.in);
    int contC=0, contB=0;
    public static double pedidoComida(Comida[] comidas) {
        PedidoComida[] ordenC = new PedidoComida[10];
        CalcularTotal calcularTotal= new CalcularTotal();

        int contC = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("               REGISTRAR PEDIDO");
        for (Comida comida : comidas) {
            System.out.println(comida.getNombre() + " - $" + comida.getPrecio());
        }
        System.out.println("Nombre del producto:");
        String producto = scanner.next();
        double total=0;
        for (int i = 0; i < comidas.length; i++) {
            if (comidas[i].getNombre().equals(producto)) {
                contC++;
                int c = +contC;
                System.out.println("\t\t\t----------Producto----------");
                System.out.println("\t\t\t\t        ---");
                System.out.println("\t\t\t      -" + comidas[i].getNombre() + "\nDescripcion: " + comidas[i].getDescripcion());
                System.out.println("\t\t\t\t   Precio: $" + comidas[i].getPrecio());
                System.out.println("\t\t\t----------------------------");
                System.out.println("\t\t\t\t        ---");
                System.out.println("Cuantas ordenes desea pedir:");
                int ordenesC = scanner.nextInt();
                System.out.println("Observaciones:");
                scanner.nextLine();
                String obser = scanner.nextLine();
                double presio= comidas[i].getPrecio();
                ordenC[c] = new PedidoComida(contC, comidas[i].getNombre(), ordenesC, obser, comidas[i].getPrecio());
                total=calcularTotal.calcularComida(ordenesC,presio);

            }


        }return total;
    }
    public static double pedidoBebida(Bebida[] bebidas){
        CalcularTotal calcularTotal= new CalcularTotal();
        PedidoBebida [] ordenB= new PedidoBebida[10];
        Scanner scanner= new Scanner(System.in);
        int c=0;
        double total=0;
        System.out.println("               REGISTRAR PEDIDO");
        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getNombre() + " - $" + bebida.getPrecio());
        }
        System.out.println("Nombre del producto:");
        String producto= scanner.next();
        for (int i=0; i<bebidas.length;i++){

            if(bebidas[i].getNombre().equals(producto)){
                c++;
                int cont=+c;
                System.out.println("\t\t\t----------Producto----------");
                System.out.println("\t\t\t\t        ---");
                System.out.println("\t\t\t    -"+bebidas[i].getNombre()+"\nDescripcion: "+ bebidas[i].getDescripcion());
                System.out.println("\t\t\t\t   Precio: $"+bebidas[i].getPrecio());
                System.out.println("\t\t\t----------------------------");
                System.out.println("\t\t\t\t        ---");
                System.out.println("Desea adquirir su producto en (copa o litro):");
                scanner.nextLine();
                String ordenesB=scanner.nextLine();
                System.out.println("Observaciones:");
                String obser= scanner.nextLine();
                ordenB[cont]= new PedidoBebida(bebidas[i].getNombre(),ordenesB,obser,bebidas[i].getPrecio());
                total= calcularTotal.calcularBebida(ordenesB,bebidas[i].getPrecio());
            }
        }return total;
    }


}
