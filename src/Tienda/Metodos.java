package Tienda;

public class Metodos {
    //aqui irá toda la logica de negocio, es decir, todo lo que se nos pide
    public Tienda[][] crearYLlenarMatriz(int dimension) {
        Tienda[][] matrix = new Tienda[dimension][dimension];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //vamos a usar una matriz de 2x2
                Tienda produto = new Tienda(); //cada iteració va a ser un producto nuevo
                // a partir del objeto creado se accede a los atributos de la tienda para llenar el almacen de la tienda (matriz)
                System.out.println("Ingrese el nombre del producto: ");
                produto.setNombre(System.console().readLine());
                //System.out.println("Ingrese la cantidad disponible: ");
                produto.setCantidad((int) (Math.random() * 10));
                //System.out.println("Ingrese el precio del producto: ");
                produto.setPrecio((Math.random() * 10000) + 1);
                matrix[i][j] = produto; //todos los atributos del objeto se guardaran en la posicion i,j
            }
        }
        return matrix;
    }

    public void mostrarMatriz(Tienda[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Producto " + (i) + "," + (j) + " " + matrix[i][j].getNombre());
                System.out.println("Cantidad: " + matrix[i][j].getCantidad());
                System.out.println(" Precio: " + matrix[i][j].getPrecio());
            }
            System.out.println();
        }
    }

    public int CantidadTotalInventario(Tienda[][] matrix) {
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

    //crear un metodo que me fusione dos matrices y que sume el stock de los productos identicos
    /*
        Nesesito que tome las dos matrices a y b
        Cree una matriz c
        itere cada posicion de la matriz a y la guarde en c
        itere cada posicion de la matriz  b y la guarde en c
        si el elemento en b es igual al elemento a (se llama igual), entonces que sume su stock

    * */
    public Tienda[][] fusionarTiendas(Tienda[][] a, Tienda[][] b) {
        Tienda[][] tiendaSuma = new Tienda[a.length][b.length];
        for (int i = 0; i < tiendaSuma.length; i++) {
            for (int j = 0; j < tiendaSuma.length; j++) {
                tiendaSuma[i][j] = a[i][j];
            }
        }
        Tienda objetoAReescribir = new Tienda();
        for (int i = 0; i <tiendaSuma.length ; i++) {
            for (int j = 0; j < tiendaSuma.length; j++) {
               if(tiendaSuma[i][j].getNombre().equalsIgnoreCase(b[i][j].getNombre())){
                   //nesesito tomar los objecto de tiendaSuma y b y lo guardo en la posicion ij, enatonces crearia un objeto
                   //y lo reescribo en la posicion i j
                   objetoAReescribir.setPrecio(tiendaSuma[i][j].getPrecio());
                   objetoAReescribir.setCantidad(tiendaSuma[i][j].getCantidad() + b[i][j].getCantidad());
                   objetoAReescribir.setNombre(tiendaSuma[i][j].getNombre());
                   tiendaSuma[i][j] = objetoAReescribir;
               }
            }
        }
        return tiendaSuma;
    }
}
/* if(!(a[i][j] == b[i][j])){
                    tiendaSuma[i][j] = b[i][j];
                }*/