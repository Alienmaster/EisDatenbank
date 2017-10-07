package Werkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EisessenWerkzeug implements ActionListener
{
        JButton button;
        public EisessenWerkzeug (JButton button)
        {
            this.button = button;
            
        }
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button)
                System.out.println("Button '" + ((JButton)e.getSource()).getText() + "' geklickt.");
        }
        
        public void Eisessen()
        {
//        System.out.println("Aktueller Bestand");
//        System.out.println(_Bestand.GibBestandAus(" "));
//        int wert2 = Integer.valueOf(_ui.TextAnzeigeUndEingabeAntwort(
//                "Welches Eis möchtest du essen? (array starts at 0)"));
//        _Bestand.EisAusDemLagerNehmen(wert2);
        }
    }

