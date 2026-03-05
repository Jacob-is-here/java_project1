package src.main;
public class Sala {
    private int maxLiczbaMiejsc;
    private String nazwa;
    
    public Sala(int maxLiczbaMiejsc, String nazwa) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
        this.nazwa = nazwa;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public String getNazwa() {
        return nazwa;
    }
    
}
