import java.util.Scanner;

public class Menu {

    public  void  opciones() {
        Scanner scanner= new Scanner (System.in);
        double totalComida=0,totalBebida=0;
        Comida[] comidas = null;
        Bebida[] bebidas = null;

        double totalFinal=0;
        int Op;
        do {
            System.out.println("----MENU----");
            System.out.println("[1].-Registrar Comida");
            System.out.println("[2].-Registrar Bebida");
            System.out.println("[3].-Mostar menus");
            System.out.println("[4].-Pedir Comida");
            System.out.println("[5].-Pedir Bebida");
            System.out.println("[6].-Calcular monto final");
            System.out.println("[7].-Salir");
            Op = scanner.nextInt();
            switch (Op) {
                case 1:
                    comidas = MenuDelDia.menuComidas();
                    break;
                case 2:
                    bebidas = MenuDelDia.menuBebidas();
                    break;
                case 3:
                    if (comidas != null) {
                        MenuPrincipal.mostrarComidas(comidas);
                    } else {
                        System.out.println("No se han registrado comidas.");
                    }
                    if (bebidas != null) {
                        MenuPrincipal.mostrarBebidas(bebidas);
                    } else {
                        System.out.println("---------------------------------");
                        System.out.println("No se han registrado bebidas.");
                        System.out.println("---------------------------------");
                    }
                    break;
                case 4:
                    totalComida=RegistrarPedido.pedidoComida(comidas);
                    break;
                case 5:
                    totalBebida=RegistrarPedido.pedidoBebida(bebidas);
                    break;
                case 6:
                    if (totalComida!=0) {
                        totalFinal=totalBebida+totalComida;
                    } else {
                        System.out.println("---------------------------------");
                        System.out.println("No se han registrado pedidos de comida.");
                        System.out.println("---------------------------------");
                    }
                    if (totalBebida==0) {
                        System.out.println("---------------------------------");
                        System.out.println("No se han registrado pedidos de bebida.");
                        System.out.println("---------------------------------");
                    }

                    System.out.println("EL TOTAL FINAL ES DE: --$"+totalFinal);
                default:

            }
        }while (Op != 7) ;
    }
}
