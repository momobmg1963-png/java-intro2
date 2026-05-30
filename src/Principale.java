import java.util.Date;

public class Principale {
    static void main(String[] args) {
      //  type nomvar = valeur;
        //  type objet = new
        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant(1,"NDIAYE","ALIOU",12,new Date(),"GIT","2025-2026",true);
        e1.setNom("SISSOKO");
        e1.setPrenom("mahamadou");

        e1.toString();
        e2.toString();
    }


}
