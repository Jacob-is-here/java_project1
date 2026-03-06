package src.main;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception{
        {   
            Film film1 = new Film("Film1",60,"Gatunek1");
            Film film2 = new Film("Film2",120,"Gatunek2");
            Film film3 = new Film("Film3",80,"Gatunek3");
            Film film4 = new Film("Film4",80,"Gatunek4");

            Sala sala1 = new Sala(40, "Sala1");
            Sala sala2 = new Sala(30, "Sala2");
            Sala sala3 = new Sala(60, "Sala3");

            LocalTime data1 = LocalTime.of(20, 0);

            Set<Integer> zajete1 = new HashSet<>(Arrays.asList(1,2,3,14,23,24));            
            Seans seans1 = new Seans(film1, data1,zajete1, sala3);
            Seans seans2 = new Seans(film3, data1, zajete1,sala2);

            List<Film> repertuar = new ArrayList<>(Arrays.asList(film1, film2, film3));
            List<Sala> listaSal= new ArrayList<>(Arrays.asList(sala1,sala2,sala3));
            List<Seans> listaSeansow = new ArrayList<>(Arrays.asList(seans1,seans2));

            Kino kino1 = new Kino("Bemowo",repertuar,listaSal,listaSeansow);

            seans1.wyswietlWolneMiejsca();

            seans1.rezerwuj(46);

            seans1.wyswietlWolneMiejsca();

            seans1.rezerwuj(2);

            kino1.dodajFilmDoRepertuaru(film1);
            kino1.dodajFilmDoRepertuaru(film4);
        }
        {
            Map<String, Double> products = new HashMap<>();
            products.put("Laptop", 3500.0);
            products.put("Myszka", 120.0);
            products.put("Klawiatura", 250.0);
            products.put("Monitor", 1200.0);
            products.put("Podkładka", 45.0);
            products.put("Słuchawki", 450.0);
            products.put("Głośniki", 320.0);
            products.put("Kabel HDMI", 25.0);

            System.out.println(products.get("Laptop"));
            System.out.println((products.entrySet().stream().filter(s -> s.getKey().equals("Myszka")).count()));

            Map<String, Double> prod = products.entrySet().stream().filter(o -> o.getValue() > 500).collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));

            System.out.println(prod);

        }
    }
}