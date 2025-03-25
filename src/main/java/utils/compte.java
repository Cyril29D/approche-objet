package utils;

public class compte {
   private int numCompte ;
   private double soldeCompte ;

    public int getNumCompte() {
        return numCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

}
