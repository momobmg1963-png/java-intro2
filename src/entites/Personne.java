package entites;

public class Personne {

    private String nom;
    private String prenom;
    private int age;
    private char sexe;
    private String adresse;
    private String phone;

    public double doublex(double x) {

        System.out.println("Le double de L=" + x + " ========> " + (x * 2));

        return 2 * x;
    }
}