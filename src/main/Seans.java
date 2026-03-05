package src.main;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Seans {
    Film film;
    LocalTime godzinaRozpoczecia;
    Set<Integer> zajeteMiejsca;// uzywamy set poniewaz miejsca nie moga sie powtarzac
    Sala salaKinowa;
    
    public Seans(Film film, LocalTime godzinaRozpoczecia,Sala salaKinowa) {
        this.film = film;
        this.godzinaRozpoczecia = godzinaRozpoczecia;
        this.zajeteMiejsca = new HashSet<>();
        this.salaKinowa = salaKinowa;
    }

    public void wyswietlWolneMiejsca() throws Exception{
        if (salaKinowa.getMaxLiczbaMiejsc() <= 0) {
            throw new Exception("Pojemność sali musi być wieksza niz 0"); 
        }
        
        for (int i = 1; i < salaKinowa.getMaxLiczbaMiejsc(); i++) {
            if (zajeteMiejsca.contains(i)){
                continue;
            }
            System.out.print(i + " ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
    public void rezerwuj(int numer) throws Exception{
        if (numer <= 0) {
            throw new Exception("Pojemność sali musi być wieksza niz 0"); 
        } else if ( numer > salaKinowa.getMaxLiczbaMiejsc() || numer < 0){
            throw new Exception("Nie istnieje takie mniejsce");
        }else if (zajeteMiejsca.contains(numer)){
            System.out.printf("%d miejsce jest juz zajęte!%n",numer);
            return;
        }else{
            zajeteMiejsca.add(numer);
            System.out.printf("%d miejsce zostało przydzielone!%n",numer);
        }
    }

    @Override
    public String toString() {
        return "Seans [film=" + film + ", godzinaRozpoczecia=" + godzinaRozpoczecia + ", zajeteMiejsca=" + zajeteMiejsca
                + ", salaKinowa=" + salaKinowa + "]";
    }

    

}
