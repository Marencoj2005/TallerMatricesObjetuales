package Tienda;

//En esta parte irá la suma total de todo el inventario de la tienda
public class Punto2 {
    public void MostrarSuma(Tienda[][] almacen){
        Metodos metodo = new Metodos();
        System.out.println(metodo.CantidadTotalInventario(almacen));
    }
}
