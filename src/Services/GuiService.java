package Services;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import StartUp.Bestand;
import StartUp.IO;
import Werkzeug.GuiWerkzeug;

public class GuiService implements ActionListener{
	JButton _button;
	Bestand _bestand;
	IO _datenbank;

	private GuiService(Bestand bestand, IO datenbank) {
		GuiWerkzeug gui = new GuiWerkzeug();
		gui.jButton3.addActionListener(this);
		_button = gui.jButton3;
		gui.sichtbarMachen();
		_bestand = bestand;
	}

	public static void oeffneGui(Bestand bestand, IO datenbank) {
		GuiService gui = new GuiService(bestand, datenbank);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == _button) {
			System.out.println("Aktueller Bestand");
			System.out.println(_bestand.GibBestandAus(" "));
		}
	}

}
