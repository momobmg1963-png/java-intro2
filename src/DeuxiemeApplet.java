import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeuxiemeApplet extends Applet implements ActionListener {
    // declaration des composants graphique
    Label lNom = new Label("Nom: ");
    TextField tNom = new TextField(12);
    List listNoms = new List();
    Button b = new Button("OK");

    public void init(){
        // l'ajout des composant à l'applet
        add(lNom);
        add(tNom);
        add(listNoms);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            String nom = tNom.getText();
            listNoms.add(nom);
            tNom.setText(""); // vide le champ après ajout
        }
    }
} // <- il manquait ces 2 accolades