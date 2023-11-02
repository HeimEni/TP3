package fr.eni.quelmedecin.bo;

public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numTel;

    public static int tarifConsult = 25;

    public MedecinGeneraliste(String nom, String prenom, String numTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
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

    public int getTarifConsult() {
        return tarifConsult;
    }

    public static void setTarifConsult(int tarifConsult) {
        MedecinGeneraliste.tarifConsult = tarifConsult;
    }

    public void afficher(){
        System.out.println(this.getNom() + " " + this.getPrenom());
        System.out.println("téléphone " + this.getNumTel());
        System.out.println("Tarif : " + getTarifConsult());
    }


}
