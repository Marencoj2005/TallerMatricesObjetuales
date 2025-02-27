package Tienda;

public class Punto1 {

    public Tienda[][] ingresarDatos(){
        //aqui mostrará el resultado del metodo que se nesesite
        System.out.println("Ingrese la dimension de la matriz:");
        int dimension = Integer.parseInt(System.console().readLine());
        Metodos metodo = new Metodos();
        Tienda[][] tienda = metodo.crearYLlenarMatriz(dimension);
        return tienda;
    }
    public void mostrarDatos(Tienda[][] almacen){
        Metodos metodo = new Metodos();
        metodo.mostrarMatriz(almacen);
    }
    public Tienda[][] CrearSegundoInventarioYSumar(Tienda[][] tienda1){
        System.out.println("Ingrese la dimensión de la matriz");
        int dimension = Integer.parseInt(System.console().readLine());
        Metodos metodo = new Metodos();
        Tienda[][] tienda2 = metodo.crearYLlenarMatriz(dimension);
        metodo.mostrarMatriz(tienda2);
        return metodo.fusionarTiendas(tienda1, tienda2);
    }
}
