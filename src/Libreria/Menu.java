package Libreria;

public class Menu {
    public static void main(String[] args) {
        String tittle = "███████ ███████  ██████ ██████  ██ ██████  ███████      █████  ██       ██████   ██████       █████   ██████  ██    ██     ██████   █████  ██████   █████      ██████  ██████   ██████  ██████   █████  ██████      ██    ██ ███    ██     ███████ ███████ ████████ ██ ██       ██████      ██████  ███████     ███████ ██    ██ ███████ ███    ██ ████████ ███████ \n" +
                "██      ██      ██      ██   ██ ██ ██   ██ ██          ██   ██ ██      ██       ██    ██     ██   ██ ██    ██ ██    ██     ██   ██ ██   ██ ██   ██ ██   ██     ██   ██ ██   ██ ██    ██ ██   ██ ██   ██ ██   ██     ██    ██ ████   ██     ██      ██         ██    ██ ██      ██    ██     ██   ██ ██          ██      ██    ██ ██      ████   ██    ██    ██      \n" +
                "█████   ███████ ██      ██████  ██ ██████  █████       ███████ ██      ██   ███ ██    ██     ███████ ██    ██ ██    ██     ██████  ███████ ██████  ███████     ██████  ██████  ██    ██ ██████  ███████ ██████      ██    ██ ██ ██  ██     █████   ███████    ██    ██ ██      ██    ██     ██   ██ █████       █████   ██    ██ █████   ██ ██  ██    ██    █████   \n" +
                "██           ██ ██      ██   ██ ██ ██   ██ ██          ██   ██ ██      ██    ██ ██    ██     ██   ██ ██ ▄▄ ██ ██    ██     ██      ██   ██ ██   ██ ██   ██     ██      ██   ██ ██    ██ ██   ██ ██   ██ ██   ██     ██    ██ ██  ██ ██     ██           ██    ██    ██ ██      ██    ██     ██   ██ ██          ██      ██    ██ ██      ██  ██ ██    ██    ██      \n" +
                "███████ ███████  ██████ ██   ██ ██ ██████  ███████     ██   ██ ███████  ██████   ██████      ██   ██  ██████   ██████      ██      ██   ██ ██   ██ ██   ██     ██      ██   ██  ██████  ██████  ██   ██ ██   ██      ██████  ██   ████     ███████ ███████    ██    ██ ███████  ██████      ██████  ███████     ██       ██████  ███████ ██   ████    ██    ███████ \n" +
                "                                                                                                         ▀▀                                                                                                                                                                                                                                                         \n" +
                "                                                                                                                                                                                                                                                                                                                                                                    ";
        System.out.println(tittle);
        System.out.println("Ingrese el numero de la opcion que desea realizar:");
        System.out.println(" [1] Ingresar elementos a la libreria ");
        int option = Integer.parseInt(System.console().readLine());
        switch (option){
            case 1:
            Punto2 punto2 = new Punto2();
            System.out.println("Ingrese el tamaño de la estateria");
            System.out.println("NOTA: El estante es de NxN, por lo que si ingresa 2, el tamaño total del estante es 4");
            int tamano = Integer.parseInt(System.console().readLine());
            Libreria[][] estateria = new Libreria[tamano][tamano];
            punto2.P2(estateria, tamano);
        }
    }
}
