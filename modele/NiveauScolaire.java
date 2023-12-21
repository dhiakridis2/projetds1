package modele;

import java.util.ArrayList;

public class NiveauScolaire {
    String codde;
    String nom;
    Professeur professeur;
    ArrayList<Etudiant> etudiants;

    public NiveauScolaire(String codde, String nom) {
        this.codde = codde;
        this.nom = nom;
    }

    public String getCodde() {
        return codde;
    }

    public void setCodde(String codde) {
        this.codde = codde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }
    public void ajoutEtudiant(Etudiant etudiant){
        this.etudiants.remove(etudiant);
    }
}
