import java.util.Scanner;

public class calculadoraModular {

    public static void main(String[] args) {
        var input = new Scanner(System.in);

        mostrarMenu(input);

        input.close();
    }

    private static void mostrarMenu(Scanner sc) {
        System.out.println("Bienvenido a la Calculadora Modular : .");
        System.out.println("================================");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. módulo
                0. Salir
                """);

        System.out.println("Seleccione una opción:");

        var opcion = leerEntero(sc, "Ingrese una opción del menú: ");

        switch (opcion) {
            case 1 -> sumar(sc);
            case 2 -> restar(sc);
            case 3 -> multiplicar(sc);
            case 4 -> dividir(sc);
            case 5 -> modulo(sc);
            case 0 -> System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
            default -> System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
        }

        if (opcion != 0) {
            mostrarMenu(sc);
        }

    }

    private static int leerEntero(Scanner input, String mensaje) {
        System.out.print(mensaje);
        var entrada = input.nextInt();
        input.nextLine();
        return entrada;
    }

    private static void sumar(Scanner input) {

        System.out.println("Función de suma .\n");

        var num1 = leerEntero(input, "Ingrese el primer número: ");
        var num2 = leerEntero(input, "Ingrese el segundo número: ");

        var resultado = num1 + num2;

        System.out.printf("La suma de %,d + %,d es = %,d \n", num1, num2, resultado);

        System.out.println("Presione Enter para continuar...");
        input.nextLine();

    }

    private static void restar(Scanner input) {
        System.out.println("Función de Resta .\n");

        var num1 = leerEntero(input, "Ingrese el primer número: ");
        var num2 = leerEntero(input, "Ingrese el segundo número: ");

        var resultado = num1 - num2;

        System.out.printf("La Resta de %,d - %,d es = %,d \n", num1, num2, resultado);

        System.out.println("Presione Enter para continuar...");
        input.nextLine();
    }

    private static void multiplicar(Scanner input) {
        System.out.println("Función de Multiplicacion .\n");

        var num1 = leerEntero(input, "Ingrese el primer número: ");
        var num2 = leerEntero(input, "Ingrese el segundo número: ");

        var resultado = num1 * num2;

        System.out.printf("La Multiplicacion de %,d * %,d es = %,d \n", num1, num2, resultado);

        System.out.println("Presione Enter para continuar...");
        input.nextLine();
    }

    private static void dividir(Scanner input) {
        System.out.println("Función de Division .\n");

        var num1 = leerEntero(input, "Ingrese el primer número: ");
        var num2 = leerEntero(input, "Ingrese el segundo número: ");

        var resultado = num1 / num2;

        System.out.printf("La Division de %,d / %,d es = %,d \n", num1, num2, resultado);

        System.out.println("Presione Enter para continuar...");
        input.nextLine();
    }

    private static void modulo(Scanner input) {
        System.out.println("Función de Modulo .\n");

        var num1 = leerEntero(input, "Ingrese el primer número: ");
        var num2 = leerEntero(input, "Ingrese el segundo número: ");

        var resultado = num1 % num2;

        System.out.printf("El Modulo de %,d %% %,d es = %,d \n", num1, num2, resultado);

        System.out.println("Presione Enter para continuar....");
        input.nextLine();
    }

}
