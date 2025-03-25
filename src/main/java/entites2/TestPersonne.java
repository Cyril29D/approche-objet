package entites2;

public class TestPersonne {
    public static void main(String[] args) {
        personne pers1 = new personne("test","sim");

        personne p2 = new personne("test1","test");
        p2.adr3.ville= "mtp";
        p2.adr3.numeroRue = 22 ;
        p2.adr3.codePostal = 34000;
        p2.adr3.libelleRue = "test";
    }
}
