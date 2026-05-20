
public abstract class Personaje {

    protected String nombre;
    protected int puntosDeVida;

    //Constructor para inicializar los datos del personaje
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; //Todos comienzan con 100 puntos de vida
    }

    public abstract void atacar(Personaje enemigo);

    //Metodo para recibir daño
    public void recibirDano(int dano) {

        this.puntosDeVida -= dano;
        
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; //No se puede tenermenos de 0 puntos de vida
        }
    }

    //Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    //Devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    //Devuelve los puntos de vida actuales del personaje
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}