package Teatro;
/*Nesesito emular los asientos de un teatro que de forma ascente, es decir, del m al n
* No es obligatorio que la matriz sea cuadrada*/
public class Teatro {
    private int numero; //supongo que es el numeral del asiento
    private double precio;
    private int fila;

    public Teatro(){}

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public int getFila() {
        return fila;
    }
}
