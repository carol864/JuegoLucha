class JuegoLucha {
    private Personaje jugador1 ;
    private Personaje jugador2 ;

    // Constructor para inicializar los personajes
    public JuegoLucha ( Personaje jugador1, Personaje jugador2 ) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    // Metodo para iniciar la pelea
    public void iniciarPelea () {

        while(jugador1.estaVivo() && jugador2.estaVivo()){

            turno(jugador1, jugador2);

            if(jugador2.estaVivo()){
                turno(jugador2, jugador1);
            }
        }

        if(jugador1.estaVivo()){
            System.out.println(jugador1.getNombre() + " ganó");
        }

        else{
            System.out.println(jugador2.getNombre() + " ganó");
        }

    }
    

    // Metodo que representa un turno de ataque
    private void turno ( Personaje atacante , Personaje defensor ) {
        
        atacante.atacar(defensor);

        System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " HP");
    }

}