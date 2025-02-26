package Teatro;

public class menu {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Ingrese el tamaño de la sala \n Recuerde que se calcula en NxN, es decir \n" +
                "Si usted ingresa 2, entonces el tamaño será de 4");
        int tamano = Integer.parseInt(System.console().readLine());

        Metodos metodos = new Metodos();
        Teatro[][] sala = metodos.crearYllenarMatriz(tamano);
        metodos.mostrarSala(sala);
        System.out.println("Asientos Ordenados de Menor a Mayor");
        System.out.println();
        metodos.ordenarAsientos(sala);
        metodos.mostrarSala(sala);

        System.out.println("Se ordenó cada fila de la sala de menor a mayor (ascendete)");
        System.out.println("Gracias por usar nuestro programa");
    }
}
