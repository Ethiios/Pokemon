public class PokemonFeu extends Pokemon {

    public PokemonFeu(String nom, Integer hp, Integer atk, String type) {
        super(nom, hp, atk, type);

    }

    @Override
    public String toString() {
        return "PokemonFeu{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof PokemonFeu) {

            //TODO
        } else if (p instanceof PokemonEau) {

        } else if (p instanceof PokemonPlante) {

        }


    }
}