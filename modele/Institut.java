package modele;

import java.util.ArrayList;

public class Institut {
    String nomInstitut;
    String adresse;
    String numTell;
    ArrayList<Etudiant>etudiants;
    ArrayList<Professeur>professeurs;
    ArrayList<NiveauScolaire>niveauScolaires;

    public Institut() {
        this.objet();
    }
    public Institut(String nomInstitut) {
        this.nomInstitut = nomInstitut;
        this.objet();

    }
    private void objet(){
        this.etudiants=new ArrayList<Etudiant>() ;
        this.professeurs= new ArrayList<Professeur>();
        this.niveauScolaires=new ArrayList<NiveauScolaire>();
    }

    public String getNomInstitut() {
        return nomInstitut;
    }

    public void setNomInstitut(String nomInstitut) {
        this.nomInstitut = nomInstitut;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumTell() {
        return numTell;
    }

    public void setNumTell(String numTell) {
        this.numTell = numTell;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }
    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }
    public ArrayList<NiveauScolaire> getNiveauScolaires() {
        return niveauScolaires;
    }
}