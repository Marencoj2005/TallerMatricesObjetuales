package Teatro;

/*En cada fila, nesesito organizar de menor a mayor los asientos en funcion de su precio
* */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Metodos {
    // crear y llenar la matriz
    public Teatro[][] crearYllenarMatriz(int dimension){
        Teatro[][] matriz = new Teatro[dimension][dimension];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Teatro teatro = new Teatro();
                teatro.setFila(i+1);
                teatro.setNumero(j+1);
                teatro.setPrecio(Math.random() *1000 + 1); //generar precios aleatorio
                matriz[i][j] = teatro;
            }
        }
        return matriz;
    }
    public void mostrarSala(Teatro[][] sala){
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala.length; j++) {
                Teatro objet = sala[i][j]; //accedo a los elementos de la matriz
                System.out.println("Fila " + objet.getFila());
                System.out.println("Número Asiento: " + objet.getNumero());
                System.out.println("Precio: " + objet.getPrecio());
            }
            System.out.println();
        }
    }

    //ordenar matriz en funcion de los precios
    // en espera

    /*Nesesito guardar el precio mayor en una variable para despúes compararla con el siguiente precio
    *una vez hecho la comparación reordeno la matriz  (aunque aqui tengo que haceer el algoritmo de busqueda binaria)
    * nose, voy a mostrar de forma accedente primero y despues miro si lo reordeno
    *
    * Creo que lo puedo hacer ordenando cada fila con los objetos de menor a mayor
    * Por lo que debo iterar hasta la penultima columna para evitar un indexbound y poder acceder al ultimo valor de la
    * ultima columna en la matriz, pero como es una matriz muy grande usaree el metodo array.sort para mejor eficiencia
    * */
    public void ordenarAsientos(Teatro[][] m){
        for (int i = 0; i < m.length; i++) {
            Arrays.sort(m[i], (a, b) -> Double.compare(b.getPrecio(), a.getPrecio()));
            /*Define dos objetos del mismo tipo, usa el double compare para comparar el contenido de precios
            * enn los objetos, va de menor a mayor por lo que va cambiando entre el el elemento siguiente y el elemento
            * actual*/
        }
    }
}
