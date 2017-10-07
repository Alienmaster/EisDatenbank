package StartUp;

import java.util.ArrayList;

public class EisBestand implements EisBestandInterface
{
    ArrayList<StueckEis> _EisDatenbank;

    public EisBestand()
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

            _ausgabe = _ausgabe + i._Name + s
                    + i._Geschmack + s + i._Form + "\r\n";
        }
        return _ausgabe;
    }
}
