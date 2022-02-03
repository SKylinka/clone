package ru.stqa.pft.addressbook;

public class UserData {
    private final String famil;
    private final String name;
    private final String otche;
    private final String nick;
    private final String company;
    private final String tower;
    private final String fax;
    private final String mblLo;

    public UserData(String Famil, String name, String otche, String nick, String company, String tower, String fax, String mblLo) {
        this.famil = Famil;
        this.name = name;
        this.otche = otche;
        this.nick = nick;
        this.company = company;
        this.tower = tower;
        this.fax = fax;
        this.mblLo = mblLo;
    }

    public String getFamil() {
        return famil;
    }

    public String getName() {
        return name;
    }

    public String getOtche() {
        return otche;
    }

    public String getNick() {
        return nick;
    }

    public String getCompany() {
        return company;
    }

    public String getTower() {
        return tower;
    }

    public String getFax() {
        return fax;
    }

    public String getMblLo() {
        return mblLo;
    }
}
