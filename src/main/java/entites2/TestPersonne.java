package entites2;

public class TestPersonne {
    public static void main(String[] args) {
        personne pers1 = new personne("test","sim");

        personne p2 = new personne("test1","test");
        p2.adr3.ville= "mtp";
        p2.adr3.numeroRue = 22 ;
        p2.adr3.codePostal = 34000;
        p2.adr3.libelleRue = "test";

        System.out.println("Nom : " + p2.getNom());
        System.out.println("Prénom : " + p2.getPrenom());
        System.out.println("Adresse : " + p2.getAdr3().getNumeroRue() + " " + p2.getAdr3().getLibelleRue() + ", "
                + p2.getAdr3().getCodePostal() + " " + p2.getAdr3().getVille());
    }
}
