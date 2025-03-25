package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int recup = Integer.parseInt(chaine);
        int a = 25;
        int b = 30;
        int max = Integer.max(a, b);

        System.out.println("le nombre max entre "+a+" et "+b+ " est " +max);
    }
}
