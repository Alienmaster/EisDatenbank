package StartUp;

import Material.StueckEis;

public interface EisBestandInterface
{

    public void EisInsLagerLegen(StueckEis eis);

    public void EisAusDemLagerNehmen(int index);

    public String GibBestandAus(String s);

}
