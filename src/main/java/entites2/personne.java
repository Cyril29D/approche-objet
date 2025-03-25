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
}
