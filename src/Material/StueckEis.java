package Material;

public class StueckEis
{
    private String _Name;
    private String _Geschmack;
    private String _Form;

    public StueckEis(String Name, String Geschmack, String Form)
    {
        _Name = Name;
        _Geschmack = Geschmack;
        _Form = Form;
    }

    public String gibEisName()
    {
        return _Name;
    }

    public String gibEisGeschmack()
    {
        return _Geschmack;
    }

    public String gibEisForm()
    {
        return _Form;

    }

}
