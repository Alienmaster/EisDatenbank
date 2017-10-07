package StartUp;

public class StueckEis
{
    String _Name;
    String _Geschmack;
    String _Form;

    StueckEis(String Name, String Geschmack, String Form)
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
