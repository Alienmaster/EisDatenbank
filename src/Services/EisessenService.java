package Services;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EisessenService implements ActionListener
{
        JButton button;
        public EisessenService (JButton button)
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
//        System.out.println(bestand.GibBestandAus(" "));
//        int wert2 = Integer.valueOf(_ui.TextAnzeigeUndEingabeAntwort(
//                "Welches Eis möchtest du essen? (array starts at 0)"));
//        _Bestand.EisAusDemLagerNehmen(wert2);
        }
    }

