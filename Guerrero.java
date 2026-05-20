import java.util.Random;

public class Guerrero extends Personaje{

    public Guerrero(String nombre){
        super(nombre);
    }

    public void atacar(Personaje enemigo){
        Random r = new Random();

        int danio = r.nextInt(21)+10;

        enemigo.recibirDano(danio);

        System.out.println( nombre + " ataco a " + enemigo.getNombre() + " causando " + danio);
    }
}
