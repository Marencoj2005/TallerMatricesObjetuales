package Tienda;

public class Tienda {
    // procedo a crear los atributos que tendrá el objeto y que se guarden en esta matriz
    private String nombre;
    private int cantidad;
    private double precio;

    public Tienda(){
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
}
/**
 * Aqui está todo lo nesesario para que crear la matriz y que esta sea compatible con el objeto
 */

