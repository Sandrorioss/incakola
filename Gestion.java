import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inventarioInicial = 100; // Este es el numero de unidades que tendremos como maximo en el local.
        System.out.println("-------------------------------------------------------------");
        System.out.println("        SISTEMA DE GESTIÓN DE INVENTARIO DE INCA KOLA        ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Inventario inicial: " + inventarioInicial + " unidades");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Ingrese la cantidad de Inca Kola vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int inventarioActualizado = inventarioInicial - cantidadVendida;
        if (inventarioActualizado < 20) {
            System.out.println("¡CUIDADO! Unidades no disponibles, Realice un pedido de reposición lo más pronto posible.");
        } else {
            System.out.println("Inventario Actualizado: Quedan " + inventarioActualizado + " unidades de Inca Kola");
            System.out.println("Se han vendido " + cantidadVendida + " unidades de Inca Kola");
            System.out.println("Recomendación: Solicitar mas unidades cuando el stock disponible sea inferior a 20.");

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        scanner.close();
    }
}