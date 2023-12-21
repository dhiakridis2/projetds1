package modele;

public class Etudiant extends Persone {
    String parentNumTell;

    public Etudiant(String nom, int age,String prenom , String parentNumTell) {
        super(nom, age,prenom );
        this.parentNumTell = parentNumTell;
    }

    public Etudiant(String parentNumTell) {
        this.parentNumTell = parentNumTell;
    }

    public Etudiant() {

    }

    public String getParentNumTell() {
        return parentNumTell;
    }

    public void setParentNumTell(String parentNumTell) {
        this.parentNumTell = parentNumTell;
    }
}
