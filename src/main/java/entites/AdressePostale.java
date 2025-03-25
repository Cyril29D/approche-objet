package entites;

public class AdressePostale {


    public int numeroRue;
   public String libelleRue;

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public  int codePostal;

    public String getVille() {
        return ville;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public  String ville;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
