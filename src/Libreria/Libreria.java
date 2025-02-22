package Libreria;
/*
Crear una libreria que almacene ciertos libros que tengan como atributos
Titulo
Autor
Precio
* */
public class Libreria {
    private String titulo;
    private String autor;
    private double precio;

    public Libreria(){

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
}
