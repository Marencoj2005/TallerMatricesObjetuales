package Libreria;

public class Metodos {
    public Libreria[][] crearYLlenarLibreria(int dimension){
        Libreria[][] libreria = new Libreria[dimension][dimension];
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria.length; j++) {
                //procedo a crear cada objeto y lo almaceno en i,j
                Libreria libro = new Libreria();
                System.out.println("Ingrese el titulo del libro: ");
                libro.setTitulo(System.console().readLine());
                System.out.println("Ingrese el autor del libro");
                libro.setAutor(System.console().readLine());
                System.out.println("Ingrese el precio del libro: ");
                libro.setPrecio(Double.parseDouble(System.console().readLine()));
                libreria[i][j] = libro;
                /*Cuando estoy guardando un objeto, estoy guardando un ente informatico con sus caracteristicas
                * por lo que cada nuevo libro es un conjutno de caracterisitcas que se guardan en un espcio de memoria
                * */
            }

        }
        return libreria;
    }
    public void mostrarLibreria(Libreria[][] libreria){
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria.length; j++) {
                System.out.println("Titulo: " + libreria[i][j].getTitulo());
                System.out.println("Autor: " + libreria[i][j].getAutor());
                System.out.println("Precio: " + libreria[i][j].getPrecio());
            }
            System.out.println();
        }
    }
    // Encontrar el precio más alto
    public double precioAlto(Libreria[][] libreria){
        double expensive = 0;
        int fila = -1;
        int columna = -1;
        String nombreProducto = null;
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria.length; j++) {
                if(libreria[i][j].getPrecio() > expensive){
                    fila = i;
                    columna = j;
                    expensive = libreria[i][j].getPrecio();
                    nombreProducto = libreria[i][j].getTitulo();
                }
            }
        }
        if(nombreProducto != null){
            System.out.println("Producto con precio elevado: " + nombreProducto);
            System.out.println("Fila: " + fila + " Columna: " + columna);
        }else{
            System.out.println("Producto NO encontrado");
        }

         return expensive;
    }
}
