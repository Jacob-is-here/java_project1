package src.test;

import static org.junit.Assert.assertThrows;

import java.time.LocalTime;

import org.junit.Test;

import src.main.Film;
import src.main.Sala;
import src.main.Seans;

public class SeansTest {
    
    @Test
    public void rezerwujZeroweMiejscePowinnoRzucicWyjatek() {
        Film film1 = new Film("Film1",60,"Gatunek1");
        Sala sala3 = new Sala(60, "Sala3");
        LocalTime data1 = LocalTime.of(20, 0);
        var seans1 = new Seans(film1, data1, sala3);

        assertThrows(Exception.class, () -> {
            seans1.rezerwuj(0);
        });
    }
}
