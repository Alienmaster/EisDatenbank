package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class UI
{
    public int Hauptmenue()
    {
        System.out.println("Moin das ist das Hauptmenü");
        System.out.println("Was möchtest du tun?");
        System.out.println("1) Ausgabe des Eisbestandes");
        System.out.println("2) Eis ins aktuelle Lager legen");
        System.out.println("3) Eisessen");
        System.out.println("4) Was steht aktuell in der Datenbank Datei?");
        System.out.println("5) Schreibe aktuelles Lager in die Datenbank Datei");
        System.out.println("6) Eis aus Datenbank ins Lager legen");
        System.out.println("7) Öffne GUI");
        System.out.println("9) Programmende");

        return EingabeInt();
    }

    private int EingabeInt()
    {
        int eingabeZiffer = 0;
        BufferedReader zahl = new BufferedReader(
                new InputStreamReader(System.in));
        try
        {
            eingabeZiffer = Integer.valueOf(zahl.readLine());
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(eingabeZiffer);
        return eingabeZiffer;
    }

    private String EingabeString()
    {
        String eingabeZiffer = "";
        BufferedReader zahl = new BufferedReader(
                new InputStreamReader(System.in));
        try
        {
            eingabeZiffer = zahl.readLine();
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(eingabeZiffer);
        return eingabeZiffer;
    }

    public String TextAnzeigeUndEingabeAntwort(String Text)
    {
        System.out.println(Text);
        String _Antwort = EingabeString();
        return _Antwort;
    }

    public LinkedList<String> Menue()
    {
        LinkedList<String> _menuestringb = new LinkedList<String>();
        _menuestringb.add("Moin das ist das Hauptmenü\r\n");
        _menuestringb.add("Was möchtest du tun?\r\n");
        _menuestringb.add("1) Ausgabe des Eisbestandes");
        _menuestringb.add("2) Eis ins aktuelle Lager legen");
        _menuestringb.add("3) Eisessen");
        _menuestringb.add("4) Was steht aktuell in der Datenbank Datei?");
        _menuestringb.add("5) Schreibe aktuelles Lager in die Datenbank Datei");
        _menuestringb.add("6) Eis aus Datenbank ins Lager legen");
        _menuestringb.add("7) Öffne GUI");
        _menuestringb.add("9) Programmende");
        return _menuestringb;
    }
    
}
