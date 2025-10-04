public class App {
    public static void main(String[] args) throws Exception {

        var nombre = "Juan";
        System.out.println("Hola  " + nombre);

        nombre = nombre.toUpperCase();

        System.out.printf("Hola %s%n", nombre);

        nombre = nombre.toLowerCase();
        System.out.printf("Hola %s%n", nombre);

    }
}
