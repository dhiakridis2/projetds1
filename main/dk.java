package main;

import modele.Etudiant;
import modele.Institut;
import modele.Persone;
import modele.Professeur;
import services.InstituServ;

import java.util.Scanner;

public class dk {
    private static InstituServ instituServ;

    public static void satrt() {
        Scanner s = new Scanner(System.in);
        Institut institut = dk.creationInstitut();
        System.out.println("Bienvenue ou " + institut.getNomInstitut() + "de " + institut.getAdresse());
        String action;
        System.out.println("E = Etudiant / p = Profeseur / N = Niveau ");
        System.out.println("les actions : exit / ajouteE / afficheE / chercheE / supprimeE / ajouteP / afficheP / chercheP / supprimeP ");
        do {
            System.out.println("Qu'est ce que tu veux faire ? :");
            action = s.next();
            switch (action) {
                case "ajouteE":
                    dk.ajouteE();
                    break;
                case "afficheE":
                    dk.afficheE();
                    break;
                case "ajouteP":
                    dk.ajouteP();
                    break;
                case "afficheP":
                    dk.afficheP();
                    break;
                case "chercheE":
                    dk.chercheE();
                    break;
                case "chercheP":
                    dk.chercheP();
                    break;
            }

        } while (!action.equals("exit"));
    }

    private static Institut creationInstitut() {
        Institut institut = new Institut();
        institut.setNomInstitut("Institu Superieure de Gestion ");
        institut.setAdresse("Gabes");
        institut.setNumTell("20012001200");
        dk.instituServ = new InstituServ(institut);
        return institut;
    }

    private static void ajouteE() {
        Etudiant etudiant = new Etudiant();
      dk.setDataP(etudiant);
        dk.instituServ.ajouteEtudiant(etudiant);

    }

    public static void afficheE() {
        for (Etudiant etudiant : dk.instituServ.getInstitut().getEtudiants()) {
            System.out.println(etudiant.getnom() + " || " + etudiant.getPrenom() + " || " + etudiant.getAge());

        }
    }

    private static void ajouteP() {
        Professeur professeur = new Professeur();
        dk.setDataP(professeur);
        dk.instituServ.ajouteProfesseur(professeur);

    }
    public static void afficheP() {
        for (Professeur professeur : dk.instituServ.getInstitut().getProfesseurs()) {
            System.out.println(professeur.getnom() + " || " + professeur.getPrenom() + " || " + professeur.getAge());

        }
    }
    private static void setDataP(Persone p){
        Scanner s = new Scanner(System.in);
        System.out.println("entre le nom : ");
        p.setnom(s.next());
        System.out.println("entre le prenom: ");
        p.setPrenom(s.next());
        System.out.println("entre l'age :");
        p.setAge(s.nextInt());

       if(p instanceof Professeur){
           System.out.println("entre numero tellephone de parents :");
           ((Professeur)p).setSalire(s.nextFloat());
       } else if (p instanceof Etudiant) {
           System.out.println("entre numero tellephone de parents :");
           ((Etudiant)p).setParentNumTell(s.next());
       }

    }
    private static void chercheE(){
        Scanner s = new Scanner(System.in);
        System.out.println("entre le nom de etudiant");
        String nom = s.next();
        Etudiant etudiant=dk.instituServ.chercheEtudiantParNom(nom);
        if (etudiant == null){
            System.out.println("n'existe pas ! " );
        }
        else{
            System.out.println(etudiant.getPrenom());
        }
    }
private static void chercheP(){
    Scanner s = new Scanner(System.in);
    System.out.println("entre le nom de Professeur");
    String nom = s.next();
    Professeur professeur=dk.instituServ.chercheProffParNom(nom);
    if (professeur == null){
        System.out.println("n'existe pas ! " );
    }
    else{
        System.out.println(professeur.getPrenom());
    }
}
private  static  void supprimeE (Etudiant etudiant){
        dk.instituServ.suppEtudiant(etudiant);
}
    private  static  void supprimeP (Professeur professeur){
        dk.instituServ.suppProfesseur(professeur);
    }
}
