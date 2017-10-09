package Services;

import StartUp.Bestand;
import StartUp.IO;
import Werkzeug.GuiWerkzeug;

public class GuiService {
	 
	private GuiService(boolean visible)
	{
		GuiWerkzeug gui = new GuiWerkzeug();
		gui.setVisible(visible);
	}
	
	public static void oeffneGui(Bestand bestand, IO datenbank)
	{
		GuiService gui = new GuiService(true);
	}
}
