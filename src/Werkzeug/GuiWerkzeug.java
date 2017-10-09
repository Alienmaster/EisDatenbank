package Werkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Services.EisessenService;

public class GuiWerkzeug extends javax.swing.JFrame
{
    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();

    // Die sichtbaren Elemente werden als Objektvariablen angelegt:
    private javax.swing.JButton jButton1 = new javax.swing.JButton();
    private javax.swing.JButton jButton2 = new javax.swing.JButton();
    private javax.swing.JButton jButton3 = new javax.swing.JButton();
    private javax.swing.JButton jButton4 = new javax.swing.JButton();
    private javax.swing.JButton jButton5 = new javax.swing.JButton();
    private javax.swing.JButton jButton6 = new javax.swing.JButton();
    private javax.swing.JButton jButton7 = new javax.swing.JButton();
    private javax.swing.JButton jButton8 = new javax.swing.JButton();
    private javax.swing.JButton jButton9 = new javax.swing.JButton();
    //    private javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    //    private javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    //    private javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    //    private javax.swing.JTextField jTextField1 = new javax.swing.JTextField();

    public GuiWerkzeug()
    {

        // Was soll bei Klick auf das System-X rechts oben passieren:
        // Das Programm soll gänzlich beendet werden.
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Beachten Sie, dass Swing gar nicht so selten auf Elemente der 
        // Vorgänger-Bibliothek 'awt' zugreift. Auch Das FlowLayout gehört 
        // eigentlich zum awt. Das JPanel bekommt sein Layout:
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));
        //jPanel2.setLayout(new java.awt.FlowLayout());
        this.setTitle("Eis Datenbank");

        jButton1.setText("1) Ausgabe des Eisbestandes");
        jPanel1.add(jButton1);
        jButton2.setText("2) Eis ins aktuelle Lager legen");
        jPanel1.add(jButton2);
        jButton3.setText("3) Eisessen");
        jButton3.addActionListener(new EisessenService(jButton3));
        jPanel1.add(jButton3);
        jButton4.setText("4) Was steht aktuell in der Datenbank Datei?");
        jPanel1.add(jButton4);
        jButton5.setText("5) Schreibe aktuelles Lager in die Datenbank Datei");
        jPanel1.add(jButton5);
        jButton6.setText("6) Eis aus Datenbank ins Lager legen");
        jPanel1.add(jButton6);
        jButton7.setText("7) Öffne GUI");
        jPanel1.add(jButton7);
        jButton8.setText("8) Test");
        jPanel1.add(jButton8);
        jButton9.setText("9) Programmende");
        jPanel1.add(jButton9);
        // …und dem JPanel zuweisen
        //        jPanel2.add(jLabel1);
        //        jPanel1.add(jPanel2);

        // Das Panel zum aktiven, sichtbaren Inhalt des JFrame machen:
        this.getContentPane()
            .add(jPanel1);

        // Alle Elemente auf kleinstmögliche Größe bringen
        pack();
    }
}
