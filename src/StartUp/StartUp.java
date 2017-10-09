package StartUp;

import java.io.IOException;

import Material.StueckEis;
import Services.GuiService;
import Werkzeug.UIWerkzeug;

public class StartUp
{
    public static void main(String[] args) throws IOException
    {
        int _HauptmenuePunkt = 0;
        String _DatenbankDateiname = "EisDatenbank.txt";
        IO datenbank = new IO(_DatenbankDateiname);
        Bestand bestand = new Bestand();
        UIWerkzeug _ui = new UIWerkzeug();
        //System.out.println("Ist die Datenbank bereits vorhanden?" + _Datenbank.IstDatenbankVorhanden());

        // Demobestand
        StueckEis eis = new StueckEis("Magnum", "Schokolade", "Stiel");
        bestand.EisInsLagerLegen(eis);
        StueckEis eis2 = new StueckEis("Flutschfinger", "Wassereis", "Stiel");
        bestand.EisInsLagerLegen(eis2);
        StueckEis eis3 = new StueckEis("Domino", "Keks", "DominoEis");
        bestand.EisInsLagerLegen(eis3);

        while (_HauptmenuePunkt != 9)
        {

            _HauptmenuePunkt = _ui.Hauptmenue();
            switch (_HauptmenuePunkt)
            {
            case 1:
                System.out.println("Aktueller Eisbestand:");
                System.out.println(bestand.GibBestandAus(" "));
                break;
            case 2:
                String _Name = _ui.TextAnzeigeUndEingabeAntwort("Welche Marke ist das Eis?");
                String _Geschmack = _ui
                    .TextAnzeigeUndEingabeAntwort("Welchen Geschmack hat das Eis?");
                String _Form = _ui.TextAnzeigeUndEingabeAntwort("Welche Form hat das Eis?");
                StueckEis eis4 = new StueckEis(_Name, _Geschmack, _Form);
                bestand.EisInsLagerLegen(eis4);
                break;
            case 3:
                System.out.println("Aktueller Bestand");
                System.out.println(bestand.GibBestandAus(" "));
                int wert2 = Integer.valueOf(_ui.TextAnzeigeUndEingabeAntwort(
                        "Welches Eis möchtest du essen? (array starts at 0)"));
                bestand.EisAusDemLagerNehmen(wert2);
                break;
            case 4:
                System.out.println("Was steht aktuell in der Datenbank Datei?");
                IO io4 = new IO(_DatenbankDateiname);
                System.out.println(io4.leseDateiZeilenweise(" "));
                break;
            case 5:
                System.out.println("Öffne nun Datei und schreibe dann den Bestand in die Datei");
                IO io5 = new IO(_DatenbankDateiname);
                io5.oeffneDatenbankSchreibeInhaltUndSchliesseDatenbank(bestand.GibBestandAus(";"));
                break;
            case 6:
                IO io6 = new IO(_DatenbankDateiname);
                StringBuilder _datenbankInhalt = io6
                    .oeffneDatenbankLeseInhaltUndSchliesseDatenbank(_DatenbankDateiname, ";");
                String[] ganzeZeile = _datenbankInhalt.toString()
                    .split("\r\n");
                for (String string : ganzeZeile)
                {
                    String[] einzelneWerte = string.toString()
                        .split(";");
                    StueckEis eis6 = new StueckEis(einzelneWerte[0], einzelneWerte[1],
                            einzelneWerte[2]);
                    bestand.EisInsLagerLegen(eis6);
                }
                break;
            case 7:
               GuiService.oeffneGui(bestand, datenbank);
                break;
            default:
                System.out.println("Das war eine ungültige Auswahl. Wähle erneut");
            }
            System.out.println(
                    "Tschüss! Schreibe nun aktuellen Inhalt in die Datenbank Datei zum Abschied");
            datenbank.oeffneDatenbankSchreibeInhaltUndSchliesseDatenbank(
                    bestand.GibBestandAus(";"));
        }
        //EisDatenbank.schreibeBewegung(eis, "gegessen");
    }

}
