package StartUp;

import java.util.ArrayList;

import Material.StueckEis;

public class Bestand implements EisBestandInterface
{
    ArrayList<StueckEis> _EisDatenbank;

    public Bestand()
    {
        _EisDatenbank = new ArrayList<StueckEis>();
    }

    public void EisInsLagerLegen(StueckEis eis)
    {
        _EisDatenbank.add(eis);
    }

    public void EisAusDemLagerNehmen(int index)
    {
        _EisDatenbank.remove(index);
    }

    public String GibBestandAus(String s)
    {
        String _ausgabe = "";
        for (StueckEis i : _EisDatenbank)
            
        {

            _ausgabe = _ausgabe + i.gibEisName() + s
                    + i.gibEisGeschmack() + s + i.gibEisForm() + "\r\n";
        }
        return _ausgabe;
    }
}
