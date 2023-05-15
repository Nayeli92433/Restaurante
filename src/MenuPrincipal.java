import java.util.Scanner;

public class MenuPrincipal {
    //MenuDelDia menuDelDia= new MenuDelDia();
    RegistrarPedido registrarPedido= new RegistrarPedido();
    Scanner scanner= new Scanner(System.in);
    public void menuPrincipal() {
        int a=0;
        System.out.println("_______________________________________________________");
        System.out.println("--------------------------------------------------------");
        System.out.println("              BIENVENIDO AL RESTAURANTE");
        System.out.println("--------------------------------------------------------");
        String op, op2;
        /*do {
            MenuPrincipal.mostrarBebidas();
            RegistrarPedido.pedidoBebida();
            //RegistrarPedido.pedidoBebida();
            System.out.println("Desea ingresar otro pedido de bebida?");
            op2 = scanner.next();
        }while (op2.equals("si"));
        do {
            MenuPrincipal.mostrarComida();
            //registrarPedido.pedidoComida();
            RegistrarPedido.pedidoComida();
            System.out.println("Desea ingresar otro pedido de comida?");
            op = scanner.next();
        } while (op.equals("si"));*/
    }

    public static void mostrarBebidas(Bebida[] bebidas) {
        System.out.println("---------------------------------");
        System.out.println("         ----BEBIDAS----");
        System.out.println("---------------------------------");
        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getNombre() + " - $" + bebida.getPrecio());
        }
    }
    public static void mostrarComidas(Comida[] comidas) {
        System.out.println("---------------------------------");
        System.out.println("         ----COMIDAS----");
        System.out.println("---------------------------------");
        for (Comida comida : comidas) {
            System.out.println(comida.getNombre() + " - $" + comida.getPrecio());
        }
    }
}
