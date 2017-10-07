package StartUp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import StartUp.StueckEis;

public class IO
{
    private File _file;
    private BufferedReader _bf;
    private FileWriter _writer;

    public IO(String EisDatenbankDateiname)

    {
        _file = new File(EisDatenbankDateiname);
        FileInputStream fstream;

        try
        {
            _writer = new FileWriter(EisDatenbankDateiname, true);
            fstream = new FileInputStream(EisDatenbankDateiname);
            _bf = new BufferedReader(new InputStreamReader(fstream));
            boolean bool = _file.exists();
            if (!bool)
            {
                _file.createNewFile();
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public boolean IstDatenbankVorhanden()
    {
        return (_file.exists());
    }

    private void SchreibeZeileInsLog(String Zeile)

    {
        try
        {
            _writer.write(Zeile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void SchliesseDateiZugriff()
    {
        try
        {
            _writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void schreibeBewegung(StueckEis eis, String bewegung)
    {

        try
        {
            _writer.write(eis.gibEisName() + " " + bewegung + "\r\n");
            _writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public StringBuilder leseDateiZeilenweise(String z)
    {
        ArrayList<String> Inhalt = new ArrayList<String>();
        try
        {
            String line;
            String[] parts;

            while ((line = _bf.readLine()) != null)
            {
                //System.out.println(line);
                parts = line.split(";");
                for (String s : parts)
                {
                    Inhalt.add(s + z);
                }
                Inhalt.add("\r\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        for (String s : Inhalt)
        {
            builder.append(s);
        }
        return builder;
    }

    public StueckEis macheAusDatenbankDateiEinenNeuenBestand()
    {
        String line = "";
        String[] parts = new String[3];

        try
        {
            while ((line = _bf.readLine()) != null)
            {
                System.out.println(line);
                parts = line.split(";");

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return nimmArrayUndErstelleEinsNeuesExemplarVomTypStueckEis(parts);
    }

    public StueckEis nimmArrayUndErstelleEinsNeuesExemplarVomTypStueckEis(String[] string)
    {
        StueckEis _eis = new StueckEis(string[0], string[1], string[2]);
        return _eis;
    }

    public StringBuilder oeffneDatenbankLeseInhaltUndSchliesseDatenbank(
            String EisDatenbankDateiname, String z)
    {
        IO Datenbank = new IO(EisDatenbankDateiname);
        StringBuilder Inhalt = Datenbank.leseDateiZeilenweise(z);
        SchliesseDateiZugriff();
        return Inhalt;
    }

    public void oeffneDatenbankSchreibeInhaltUndSchliesseDatenbank(String string)
    {
        SchreibeZeileInsLog(string);
        SchliesseDateiZugriff();
    }
}
