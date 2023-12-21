package services;

import modele.Etudiant;
import modele.Institut;
import modele.NiveauScolaire;
import modele.Professeur;

public class InstituServ {
    Institut institut;
    private String prenom;
    public InstituServ(Institut institut) {
        this.institut = institut;
    }
    public InstituServ() {}
    public Institut getInstitut() {
        return institut;
    }

    public void ajouteEtudiant(Etudiant etudiant){
        this.institut.getEtudiants().add(etudiant);
    }

    public void ajouteProfesseur(Professeur professeur){
        this.institut.getProfesseurs().add(professeur);
    }
    public void ajouteNiveau(NiveauScolaire niveauScolaire){
        this.institut.getNiveauScolaires().add(niveauScolaire);
    }
    public void suppEtudiant(Etudiant etudiant){
        this.institut.getEtudiants().remove(etudiant);
    }
    public void suppProfesseur(Professeur professeur){
        this.institut.getProfesseurs().remove(professeur);
    }
    public void suppNiveau(NiveauScolaire niveauScolaire){
        this.institut.getNiveauScolaires().remove(niveauScolaire);
    }
    public Etudiant chercheEtudiantParNom(String nom){
        Etudiant a = null;

        for (Etudiant etudiant : this.institut.getEtudiants()){
            if (etudiant.getnom().equals(nom)){
                a = etudiant;
                break;
            }
        }
        return a;
    }
    public Professeur chercheProffParNom(String nom){
        Professeur a = null;

        for (Professeur professeur : this.institut.getProfesseurs()){
            if(professeur.getnom().equals(nom)){
                a = professeur;
                break;
            }
        }
        return a;
    }
    public NiveauScolaire chercheNivParcode(String codde){
        NiveauScolaire a = null;

        for (NiveauScolaire niveauScolaire : this.institut.getNiveauScolaires()){
            if(niveauScolaire.getCodde().equals(codde)){
                a = niveauScolaire;
                break;
            }
        }
        return a;
    }




}
