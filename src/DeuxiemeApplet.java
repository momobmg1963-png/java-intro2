import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeuxiemeApplet extends JFrame implements ActionListener {
    // déclaration des composants graphiques
    Label lNom = new Label("Nom: ");
    TextField tNom = new TextField(12);
    List listNoms = new List();
    Button b = new Button("OK");

    public DeuxiemeApplet() {
        // titre de la fenêtre
        setTitle("Mon Applet");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // ajout des composants à la fenêtre
        add(lNom);
        add(tNom);
        add(b);
        add(listNoms);

        b.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b) {
            listNoms.add(tNom.getText());
            tNom.setText("");
        }
    }

    public static void main(String[] args) {
        new DeuxiemeApplet();
    }
}