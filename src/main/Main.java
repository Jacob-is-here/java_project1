package src.main;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
        Film film1 = new Film("Film1",60,"Gatunek1");
        Film film2 = new Film("Film2",120,"Gatunek2");
        Film film3 = new Film("Film3",80,"Gatunek3");
        Film film4 = new Film("Film4",80,"Gatunek4");

        Sala sala1 = new Sala(40, "Sala1");
        Sala sala2 = new Sala(30, "Sala2");
        Sala sala3 = new Sala(60, "Sala3");

        LocalTime data1 = LocalTime.of(20, 0);

        Set <Integer> zajete1 = Set.of(1,2,3,14,23,24);
        Seans seans1 = new Seans(film1, data1, sala3);
        seans1.zajeteMiejsca = zajete1;
        Seans seans2 = new Seans(film3, data1, sala2);
        seans2.zajeteMiejsca = zajete1;

        List<Film> repertuar = List.of(film1,film2,film3);
        List<Sala> listaSal= List.of(sala1,sala2,sala3);
        List<Seans> listaSeansow = List.of(seans1,seans2);

        Kino kino1 = new Kino("Bemowo");
        kino1.listaSal = listaSal;
        kino1.listaSeansow = listaSeansow;
        kino1.repertuar = repertuar;

        seans1.wyswietlWolneMiejsca();

        seans1.rezerwuj(46);

        seans1.wyswietlWolneMiejsca();

        seans1.rezerwuj(2);

        kino1.dodajFilmDoRepertuaru(film1);
        kino1.dodajFilmDoRepertuaru(film4);


    }
}