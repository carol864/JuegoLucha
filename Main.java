import java.util.Scanner;

public class Main {
    
    // Metodo principal que ejecuta el juego
    public static void main ( String [] args ) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese nombre jugador 1: ");

        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese nombre jugador 2: ");

        String nombre2 = scanner.nextLine();

        Personaje jugador1 = new Espada(new Armadura(new Guerrero(nombre1)));

        Personaje jugador2 = new Guerrero(nombre2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();
        
    } 

}
