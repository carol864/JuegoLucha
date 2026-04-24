public class JuegoLucha {
    private final Personaje jugador1;
    private final Personaje jugador2;

    public JuegoLucha(String nombreJugador1, String nombreJugador2) {
        this.jugador1 = new Personaje(nombreJugador1);
        this.jugador2 = new Personaje(nombreJugador2);
    }

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "...");
        System.out.println("--------------------------------------------------");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            ejecutarTurno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                ejecutarTurno(jugador2, jugador1);
            }
            System.out.println("--------------------------------------------------");
        }

        if (jugador1.estaVivo()) {
            System.out.println("El ganador es " + jugador1.getNombre() + " con " + jugador1.getPuntosDeVida() + " puntos de vida.");
        } else {
            System.out.println("El ganador es " + jugador2.getNombre() + " con " + jugador2.getPuntosDeVida() + " puntos de vida.");
        }
    }

    private void ejecutarTurno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre());
        System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " puntos de vida antes del ataque.");
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
}