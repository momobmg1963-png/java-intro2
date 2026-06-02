package entites;

import java.util.Date;
import java.util.Scanner;

public class Etudiant {


    private int id;
    private String nom;
    private String prenom;
    private int age;
    private Date dateNaiss;
    private String filiere;
    private String annescol;
    private boolean etat;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom, int age, Date dateNaiss, String filiere, String annescol, boolean etat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaiss = dateNaiss;
        this.filiere = filiere;
        this.annescol = annescol;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getAnnescol() {
        return annescol;
    }

    public void setAnnescol(String annescol) {
        this.annescol = annescol;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        String s = "entites.Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateNaiss=" + dateNaiss +
                ", filiere='" + filiere + '\'' +
                ", annescol='" + annescol + '\'' +
                ", etat=" + etat +
                '}';
        System.out.println(s);
        return s;

    }

    public int snp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir un entier");
        int x = sc.nextInt();
        int snp = 0;
        for (int i = 0; i <= x; i++) {
            snp = snp + 1;


        }
        System.out.println("     :::::::: snp " + snp);
        return snp;

    }

    public int pnp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir un entier");
        int x = sc.nextInt();
        int pnp = 1;
        for (int i = 1; i <= x; i++) {
            pnp = pnp * i;



        }
        System.out.println("     :::::::: snp " + pnp);
        sc.close();
        return pnp;


    }
}
