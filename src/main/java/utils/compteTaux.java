package utils;

public class compteTaux {
    double tauxDeRemuneration ;
    compte compte = new compte(67738,200) ;

    public compteTaux(double tauxDeRemuneration, compte compte) {
        this.tauxDeRemuneration = tauxDeRemuneration;
        this.compte = compte;
    }
}
