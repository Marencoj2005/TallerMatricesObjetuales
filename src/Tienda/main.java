package Tienda;

/*
* En esta clase, irá el menú de ejecución que accederá a sus correspondientes metodos
* */
public class main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL INVENTARIO DE LA TIENDA PAQUITA LA DEL BARRIO");
        System.out.println("Seleccione la opción que desea ejecutar:");
        System.out.println("1. Ingresar y mostrar datos");
        System.out.println("2. Mostrar Cantidad Total de Productos");
        System.out.println("3. Salir");
        Tienda[][] almacen = new Tienda[0][0];
        boolean continuar = true;
        int option = Integer.parseInt(System.console().readLine());
        while(continuar){
            switch (option){
                case 1:
                    Punto1 punto1 = new Punto1();
                    almacen = punto1.ingresarDatos(); //ojo con este punto
                    System.out.println("Se ha ejecutado correctamente");
                    System.out.println();
                    punto1.mostrarDatos(almacen);
                    System.out.println("¿Desea continuar?");
                    System.out.println(" [1] Si | [2] No");
                    int option2 = Integer.parseInt(System.console().readLine());
                    if (option2 == 2) {continuar = false;}
                    System.out.println("Desea vel la cantidad total de productos en el inventario?");
                    System.out.println(" [1] Si | [2] No");
                    option2 = Integer.parseInt(System.console().readLine());
                    if (option2 == 1) {option = 2;}
                    break;
                case 2:
                    Punto2 punto2 = new Punto2();
                    System.out.println("Suma Total del Inventario: ");
                    punto2.MostrarSuma(almacen);
                    continuar = false;
                    break;
                case 3:
                    continuar = false;
                    break;
            }
        }
        System.out.println("Gracias por utilizar nuestro programa");
        }
}





