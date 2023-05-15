import java.util.Scanner;

public class MenuDelDia {

    public static  Comida[] menuComidas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de comidas que desea registrar:");
        int n = scanner.nextInt();
        Comida[] comidas = new Comida[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.println("           Ingresa los datos de la comida");
            System.out.println("--------------------------------------------------------");

            System.out.println("Introduce el nombre de la comida:");
            String nombre = scanner.next();

            System.out.println("Introduce la descripción de la comida:");
            scanner.nextLine();
            String descripcion = scanner.nextLine();
            System.out.println("Introduce el precio de la comida:");
            int precio = scanner.nextInt();
            comidas[i]= new Comida(i,nombre, descripcion, precio);

        }
        return comidas;

    }
    public static Bebida[] menuBebidas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de bebidas que desea registrar:");
        int n = scanner.nextInt();
        Bebida[] bebidas = new Bebida[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.println("           Ingresa los datos de la bebida");
            System.out.println("--------------------------------------------------------");

            System.out.println("Introduce el nombre de la bebida:");
            String nombre = scanner.next();

            System.out.println("Introduce la descripción de la bebida:");
            scanner.nextLine();
            String descripcion = scanner.nextLine();

            System.out.println("Introduce el precio de la bebida por litro:");
            int precio = scanner.nextInt();

            bebidas[i] = new Bebida(nombre, descripcion, precio);
        }

        return bebidas;

    }
}

