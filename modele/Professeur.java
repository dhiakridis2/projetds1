package modele;

public class Professeur extends Persone{
    Float salire;

    public Professeur(String nom, int age,String prenom ,Float salire) {
        super(nom, age, prenom);
        this.salire = salire;
    }

    public Professeur(Float salire) {
        this.salire = salire;
    }

    public Professeur() {

    }

    public Float getSalire() {
        return salire;
    }

    public void setSalire(Float salire) {
        this.salire = salire;
    }
}
