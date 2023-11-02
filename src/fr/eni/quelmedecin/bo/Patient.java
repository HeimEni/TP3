package fr.eni.quelmedecin.bo;

import java.time.LocalDate;

public class Patient {
    private String nom;
    private String prenom;
    private String numTel;
    private char sexe;
    private long numSecu;
    private LocalDate dateNaissance;
    private String commentaires;

    public Patient(String nom, String prenom, String numTel, char sexe, long numSecu, LocalDate dateNaissance, String commentaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public long getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(long numSecu) {
        this.numSecu = numSecu;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public void afficher(){
        System.out.println(this.getNom() + " " + this.getPrenom());
        System.out.println("téléphone " + this.getNumTel());
        System.out.println("Sexe " + this.getSexe());
        System.out.println("Numéro de Sécurité Social " + this.getNumSecu());
        System.out.println("Date de naissance " + this.getDateNaissance());
        System.out.println("Commentaires " + this.getCommentaires());

    }
}
