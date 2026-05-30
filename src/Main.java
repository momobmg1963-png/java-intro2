import java.applet.Applet;
public class Main {
    public static void main(String[] args) {
        System.out.println("Avant l'appel de l'applet");
        DeuxiemeApplet j = new DeuxiemeApplet();
        System.out.println("apres l'appel de l'applet");
        /*for(int i=1; i<=5; i++){
            System.out.println(" GIT NDIAYE");
            System.out.println(" Valeur I: " + i);
            System.out.print(" DOUMBIA\n");
        }*/

        doublex(5);
        doublex(10);
        doublex(15);
        doublex(125);
        perimetre(20,10);
        parite(13);
    }


//fonction double
    public static double doublex(double x){
        System.out.println(" le double de L=" + x + " ==========>: " + (x*2));
        return 2*x;
    }
    //fonction perimetre

    public static double perimetre(double longueur, double largeur){
        double p=0;
        p=(longueur+largeur)*2;
        System.out.println("le perimetre de L:"+longueur+" l:"+largeur+"=====> "+p);
        return p;
    }
    public static void parite(int x){
        int rest =0;
        rest =x % 2;

        if (rest == 0) System.out.println(" yes, x= "+x +" est paire");
        else System.out.println(" yes, x= "+x +" est impaire");

    }
}