public class PokemonPlante extends Pokemon {

    public PokemonPlante(String nom, Integer hp, Integer atk, String type) {
        super(nom, hp, atk, type);
    }


    @Override
    public String toString() {
        return "PokemonPlante{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof PokemonPlante) {
            //TODO
        } else if (p instanceof PokemonEau) {

        } else if (p instanceof PokemonFeu) {

        }
    }
}