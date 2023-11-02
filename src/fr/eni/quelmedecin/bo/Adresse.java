package fr.eni.quelmedecin.bo;

public class Adresse {

    private String complementaire;
    private int cp;
    private String nomCommune;
    private int numVoie;
    private String nomRue;
    private String typeRue;

    public Adresse(int numVoie, String typeRue,String nomRue, int cp,String nomCommune ) {
        this.cp = cp;
        this.nomCommune = nomCommune;
        this.numVoie = numVoie;
        this.nomRue = nomRue;
        this.typeRue = typeRue;
    }

    public Adresse(String complementaire,int numVoie, String typeRue,String nomRue, int cp,String nomCommune){
        this.complementaire = complementaire;
        this.cp = cp;
        this.nomCommune = nomCommune;
        this.numVoie = numVoie;
        this.nomRue = nomRue;
        this.typeRue = typeRue;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getNumVoie() {
        return numVoie;
    }

    public void setNumVoie(int numVoie) {
        this.numVoie = numVoie;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getTypeRue() {
        return typeRue;
    }

    public void setTypeRue(String typeRue) {
        this.typeRue = typeRue;
    }

    public String getComplementaire() {
        return complementaire;
    }

    public void setComplementaire(String complementaire) {
        this.complementaire = complementaire;
    }


    public void afficher(){
        if(this.getComplementaire() != null){
            System.out.println(this.getComplementaire());
        }
        System.out.println(this.getNumVoie() + " " + this.getNomRue());
        System.out.println(String.format("%05d", this.getCp()) + " " + this.getNomCommune());

    }
}
