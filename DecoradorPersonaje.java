public abstract class DecoradorPersonaje extends Personaje{
    
    protected Personaje personaje;

    public DecoradorPersonaje(Personaje personaje){

        super(personaje.getNombre());

        this.personaje = personaje;

    }
}
