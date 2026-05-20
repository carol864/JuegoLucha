public class Armadura extends DecoradorPersonaje{

    public Armadura(Personaje personaje){
        super(personaje);
    }

    public void atacar(Personaje enemigo){
        personaje.atacar(enemigo);
    }

    public void recibirDano(int danio){

        int reducido = danio - 5;

        if(reducido < 0){

            reducido = 0;
        }

        personaje.recibirDano(reducido);

        System.out.println(nombre + " redujo daño");
    }

    public int getPuntosDeVida(){

        return personaje.getPuntosDeVida();
    }

    public boolean estaVivo(){

        return personaje.estaVivo();
    }
}

