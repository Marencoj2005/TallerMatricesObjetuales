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
    public void mostrarDatos(Tienda[][] m){
        Metodos metodo = new Metodos();
        metodo.mostrarMatriz(m);
    }
    public Tienda[][] CrearSegundoInventarioYSumar(Tienda[][] tienda1){
        System.out.println("Ingrese la dimensión de la matriz");
        int dimension = Integer.parseInt(System.console().readLine());
        Metodos metodo = new Metodos();
        Tienda[][] tienda2 = metodo.crearYLlenarMatriz(dimension); //se llena la segunda tienda
        System.out.println("Matriz2");
        metodo.mostrarMatriz(tienda2);
        System.out.println("Matriz Aumentada");
        Tienda[][] matrizAumentada = metodo.fusionarTiendas(tienda1, tienda2);
        return matrizAumentada;
    }
}
