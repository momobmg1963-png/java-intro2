import entites.Etudiant;

import java.util.Date;

public class Principale {
    static void main(String[] args) {
      //  type nomvar = valeur;
        //  type objet = new
        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant(1,"NDIAYE","ALIOU",12,new Date(),"GIT","2025-2026",true);
        Etudiant e3 = new Etudiant(2,"thiero","mohamed",22,new Date(),"gip","2024-2025",true);
        Etudiant e4 = new Etudiant(3,"sissoko","mahamadou",20,new Date(),"git2","2023-2024",true);
        Etudiant e5 = new Etudiant(4,"cisse","sekou lamine",25,new Date(),"git2","2023-2024",true);
        Etudiant e6 = new Etudiant(5,"diallo","sekou",20,new Date(),"git2","2023-2024",true);
        Etudiant e7 = new Etudiant(6,"toure","yaya",20,new Date(),"git2","2023-2024",true);
        Etudiant e8= new Etudiant(7,"bah","amadou",20,new Date(),"git2","2023-2024",true);
        e1.setNom("SISSOKO");
        e1.setPrenom("mahamadou");

        e1.toString();
        e2.toString();
        e3.toString();
        e4.toString();
        e5.toString();
        e6.toString();
        e7.toString();
        e8.toString();
    }


}
