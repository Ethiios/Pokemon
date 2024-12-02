public class PokemonEau extends Pokemon {

    public PokemonEau(String nom, Integer hp, Integer atk, String type) {
        super(nom, hp, atk, type);
    }

    @Override
    public String toString() {
        return "PokemonEau{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof PokemonEau) {
            //TODO
        } else if (p instanceof PokemonFeu) {

        } else if (p instanceof PokemonPlante) {

        }
    }
}
