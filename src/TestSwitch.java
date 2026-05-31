import java.util.Scanner;

public class TestSwitch {
    static void main(String[] args) {
        System.out.println("donner un nombe");
        //declaration of scanner objet
        Scanner clavier = new Scanner(System.in);
        int nb =0;
        try {
             nb= clavier.nextInt();
        }catch (Exception e){

            System.out.println("eureur lors de la recuperation de l'entite");
            e.printStackTrace();
        }

        System.out.println("vous avez saisie:: "+nb);
        switch (nb){
            case 1:
                System.out.println("lundi");break;
            case 2 :
                System.out.println("mardi");break;
            case 3 :
                System.out.println("mercredi");break;
            default:
                System.out.println("autrement");break;
        }
        String toto= clavier.next();
        System.out.println("vous avez saisie::" +toto);

        System.out.println("toto");
        clavier.close();
        //test de la boucle for
        for (int i =2;i < 10;i++){
            System.out.println("I =" +i);
        }
    }
}
