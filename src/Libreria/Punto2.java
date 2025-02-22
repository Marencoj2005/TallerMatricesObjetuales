package Libreria;

public class Punto2 {
    public void P2 (Libreria[][] matrix, int dimension){
        Metodos metodo = new Metodos();
        //guardar en una matriz el resultado de crearYLlenarLibreria
        matrix = metodo.crearYLlenarLibreria(dimension);
        metodo.mostrarLibreria(matrix);
        metodo.precioAlto(matrix);
        }
    }

