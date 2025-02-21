package Tienda;

public class Metodos {
        //aqui irá toda la logica de negocio, es decir, todo lo que se nos pide
        public Tienda[][] crearYLlenarMatriz(int dimension){
            Tienda[][] matrix = new Tienda[dimension][dimension];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    //vamos a usar una matriz de 2x2
                    Tienda produto = new Tienda(); //cada iteració va a ser un producto nuevo
                    // a partir del objeto creado se accede a los atributos de la tienda para llenar el almacen de la tienda (matriz)
                    System.out.println("Ingrese el nombre del producto: ");
                    produto.setNombre(System.console().readLine());
                    System.out.println("Ingrese la cantidad disponible: ");
                    produto.setCantidad(Integer.parseInt(System.console().readLine()));
                    System.out.println("Ingrese el precio del producto: ");
                    produto.setPrecio(Double.parseDouble(System.console().readLine()));
                    matrix[i][j] = produto; //todos los atributos del objeto se guardaran en la posicion i,j
                }
            }
            return matrix;
        }
   public void mostrarMatriz(Tienda[][] matrix){
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               System.out.print("Producto " + (i) + "," + (j)+ " " + matrix[i][j].getNombre());
               System.out.println("Cantidad: " + matrix[i][j].getCantidad());
               System.out.println(" Precio: " + matrix[i][j].getPrecio());
           }
           System.out.println();
       }
   }
   public int CantidadTotalInventario(Tienda[][] matrix){
     int suma = 0;
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               //nesesito acceder al atributo de cantidad en cada posicion de la matriz
               //y sumarla, mediante una suma acumulada
               suma += matrix[i][j].getCantidad();
           }
       }
       return suma;
   }
}
