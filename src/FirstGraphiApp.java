import javax.swing.*;
import java.awt.*;

public class FirstGraphiApp {
    public static void main(String[] args) {
        //Créer une new fenetre
        JFrame jf = new JFrame("TITRE");

        //Creer les composant
        JLabel l = new JLabel("nom");
        JTextField t = new JTextField(12);
        JButton b = new JButton("OK");

        //Definir la technique de mise en page
        jf.setLayout(new FlowLayout());

        //Ajout des composant à la fenetre
        jf.add(l);
        jf.add(t);
        jf.add(b);

        //definition de la dimension de la fentre
        jf.setSize(400, 400);
        jf.setLocationRelativeTo(null); // centre la fenêtre à l'écran

        //FERMER l'app quand on clique sur X
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Afficher la fentre
        jf.setVisible(true);
    }
}