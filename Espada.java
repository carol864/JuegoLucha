public class Espada extends DecoradorPersonaje {

    public Espada(Personaje personaje){

        super(personaje);
    }

    public void atacar(Personaje enemigo){

        personaje.atacar(enemigo);

        enemigo.recibirDano(10);

        System.out.println(nombre + " hizo daño extra");
    }

    public boolean estaVivo(){

        return personaje.estaVivo();
    }

    public int getPuntosDeVida(){

        return personaje.getPuntosDeVida();
    }
}
