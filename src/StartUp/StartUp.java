package StartUp;

import java.io.IOException;

import ui.Gui;
import ui.UI;

public class StartUp
{
    public static void main(String[] args) throws IOException
    {
        int _HauptmenuePunkt = 0;
        String _DatenbankDateiname = "EisDatenbank.txt";
        IO _Datenbank = new IO(_DatenbankDateiname);
        EisBestand _Bestand = new EisBestand();
        UI _ui = new UI();
        //System.out.println("Ist die Datenbank bereits vorhanden?" + _Datenbank.IstDatenbankVorhanden());

        // Startbestand
        StueckEis eis = new StueckEis("Magnum", "Schokolade", "Stiel");
        _Bestand.EisInsLagerLegen(eis);
        StueckEis eis2 = new StueckEis("Flutschfinger", "Wassereis", "Stiel");
        _Bestand.EisInsLagerLegen(eis2);
        StueckEis eis3 = new StueckEis("Domino", "Keks", "DominoEis");
        _Bestand.EisInsLagerLegen(eis3);

        while (_HauptmenuePunkt != 9)
        {

            _HauptmenuePunkt = _ui.Hauptmenue();
            switch (_HauptmenuePunkt)
            {
            case 1:
                System.out.println("Aktueller Eisbestand:");
                System.out.println(_Bestand.GibBestandAus(" "));
                break;
            case 2:
                String _Name = _ui.TextAnzeigeUndEingabeAntwort("Welche Marke ist das Eis?");
                String _Geschmack = _ui
                    .TextAnzeigeUndEingabeAntwort("Welchen Geschmack hat das Eis?");
                String _Form = _ui.TextAnzeigeUndEingabeAntwort("Welche Form hat das Eis?");
                StueckEis eis4 = new StueckEis(_Name, _Geschmack, _Form);
                _Bestand.EisInsLagerLegen(eis4);
                break;
            case 3:
                System.out.println("Aktueller Bestand");
                System.out.println(_Bestand.GibBestandAus(" "));
                int wert2 = Integer.valueOf(_ui.TextAnzeigeUndEingabeAntwort(
                        "Welches Eis möchtest du essen? (array starts at 0)"));
                _Bestand.EisAusDemLagerNehmen(wert2);
                break;
            case 4:
                System.out.println("Was steht aktuell in der Datenbank Datei?");
                IO io4 = new IO(_DatenbankDateiname);
                System.out.println(io4.leseDateiZeilenweise(" "));
                break;
            case 5:
                System.out.println("Öffne nun Datei und schreibe dann den Bestand in die Datei");
                IO io5 = new IO(_DatenbankDateiname);
                io5.oeffneDatenbankSchreibeInhaltUndSchliesseDatenbank(_Bestand.GibBestandAus(";"));
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
                    _Bestand.EisInsLagerLegen(eis6);
                }
                break;
            case 7:
                Gui gui = new Gui();
                gui.setVisible(true);
            case 9:
                System.out.println(
                        "Tschüss! Schreibe nun aktuellen Inhalt in die Datenbank Datei zum Abschied");
                _Datenbank.oeffneDatenbankSchreibeInhaltUndSchliesseDatenbank(
                        _Bestand.GibBestandAus(";"));
                break;
            default:
                System.out.println("Das war eine ungültige Auswahl. Wähle erneut");
            }
        }
        //EisDatenbank.schreibeBewegung(eis, "gegessen");
    }

}
