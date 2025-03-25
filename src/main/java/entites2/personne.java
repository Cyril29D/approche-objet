package entites2;

import entites.AdressePostale;

public class personne {
   public String nom ;
   public String prenom ;
   AdressePostale adr3 = new AdressePostale(222,"test",12,"mtp");

   public personne(String nom, String prenom) {
      this.nom = nom;
      this.prenom = prenom;
   }

   public personne(String nom, String prenom, AdressePostale adr3) {
      this.nom = nom;
      this.prenom = prenom;
      this.adr3 = adr3;
   }

   public void afficherNomMaj() {
      System.out.println(prenom + " " + nom.toUpperCase());
   }
   public void modifierNom(String nouveauNom) {
      this.nom = nouveauNom;
   }
   public void modifierPrenom(String nouveauPrenom){
      this.prenom = nouveauPrenom ;
   }
   public void modifierAdresse(AdressePostale adr4){
      this.adr3 = adr4 ;
   }

   public String getNom() {
      return nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public AdressePostale getAdr3() {
      return adr3;
   }

}
