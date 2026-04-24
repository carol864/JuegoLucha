import java.util.Random;

public class Personaje {
    private static final int MIN_DANO = 10;
    private static final int MAX_DANO = 30;
    private static final int VIDA_INICIAL = 100;

    private final String nombre;
    private int puntosDeVida;
    private final Random random;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = VIDA_INICIAL;
        this.random = new Random();
    }

    public void atacar(Personaje oponente) {
        int dano = random.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " y causa " + dano + " puntos de daño.");
    }

    public void recibirDano(int dano) {
        puntosDeVida -= dano;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}