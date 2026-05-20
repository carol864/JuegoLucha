public class Main {
    
    // Metodo principal que ejecuta el juego
    public static void main ( String [] args ) {

        Personaje jugador1 = new Espada(new Armadura(new Guerrero("Ryu")));

        Personaje jugador2 = new Guerrero("Ken");

        JuegoLucha pelea = new JuegoLucha(jugador1, jugador2);

        pelea.iniciarPelea();
        
    } 

}
