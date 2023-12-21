package modele;

public class Persone {
    String nom;
    int age;
    String prenom;

    public Persone(String nom, int age,String prenom) {
        this.nom = nom;
        this.age = age;
        this.prenom=prenom;
    }

    public Persone() {
    }

    public String getnom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
