package utils;

public class TestBanque {
    public static void main(String[] args) {
        compte compte1 = new compte(123456789, 1000);

        System.out.println("Numéro de compte : " + compte1.getNumCompte());
        System.out.println("Solde du compte : " + compte1.getSoldeCompte() + " €");

    }
}
