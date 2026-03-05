package src.main;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Kino {
    List<Film> repertuar;
    List<Sala> listaSal;
    List<Seans> listaSeansow ;
    String nazwa ;
    
    public Kino(String nazwa) {
        this.nazwa = nazwa;
        this.repertuar = new ArrayList<>();
        this.listaSal = new ArrayList<>();
        this.listaSeansow = new ArrayList<>();
    }

    public void dodajFilmDoRepertuaru(Film film){
        if (repertuar.contains(film)) {
            System.out.println("Ten film juz istnieje!");
        }else{
            repertuar.add(film);
            System.out.println("Został dodany nowy film : "+film.toString());
        }
    }

    public void zaplanujSeans(Seans seans){
        
        boolean kolizja = listaSeansow.stream().anyMatch(o -> (o.salaKinowa.equals(seans.salaKinowa) ) && (o.godzinaRozpoczecia.equals(seans.godzinaRozpoczecia)));
        
        if(kolizja){
            System.out.println("Nie jest mozliwe dodanie seansu o tej godzinie w tej sali!");
        }
        
        listaSeansow.add(seans);
        System.out.println("Seans został dodany.");
    }

    public void znajdzFilmyOGodzinie(LocalTime godzina){
        Seans seans = listaSeansow.stream().filter(o -> o.godzinaRozpoczecia.equals(godzina)).findFirst().orElse(null);
        if(seans != null){
            System.out.println(seans.toString());
        }
        System.out.println("O podanej godzinie nie występuje rzaden film.");
    }

}
