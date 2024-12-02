public class Pokemon {

    protected String nom;
    protected Integer hp;
    protected Integer atk;
    protected String type;

    public Pokemon(String nom, Integer hp, Integer atk, String type) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
        this.type = type;
    }

    public boolean isDead() {
        if (hp <= 0) {
            return true;
        }
        return false;
    }

    public void attaquer(Pokemon p){
        p.setHp(p.getHp() -this.getAtk());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", type='" + type + '\'' +
                '}';
    }
}
