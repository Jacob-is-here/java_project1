package src.test;

import static org.junit.Assert.assertThrows;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import src.main.Film;
import src.main.Sala;
import src.main.Seans;

public class SeansTest {
    
    @Test
    public void rezerwujZeroweMiejscePowinnoRzucicWyjatek() throws Exception {
        Film film1 = new Film("Film1",60,"Gatunek1");
        Sala sala3 = new Sala(60, "Sala3");
        LocalTime data1 = LocalTime.of(20, 0);
        Set<Integer> zajete1 = new HashSet<>(Arrays.asList(1,2,3,14,23,24));            

        var seans1 = new Seans(film1, data1, zajete1,sala3);

        assertThrows(Exception.class, () -> {
            seans1.rezerwuj(0);
        });
    }
}
