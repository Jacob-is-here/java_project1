package src.main;
public class Film {
    private String tytul;
    private int czasTrwania ; // w minutach
    private String gatunek;
    
    public Film(String tytul, int czasTrwania, String gatunek) {
        this.tytul = tytul;
        // if (czasTrwania <= 0){
        //     throw new Exception("Czas trwania filmu niemoe być mniejszy niz 0 minut");
        // }
        this.czasTrwania = czasTrwania;
        this.gatunek = gatunek;
    }

    public String getTytul() {
        return tytul;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public String getGatunek() {
        return gatunek;
    }

    

    @Override
    public String toString() {
        return "Film [tytul=" + tytul + ", czasTrwania=" + czasTrwania + ", gatunek=" + gatunek + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
        result = prime * result + czasTrwania;
        result = prime * result + ((gatunek == null) ? 0 : gatunek.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Film other = (Film) obj;
        if (tytul == null) {
            if (other.tytul != null)
                return false;
        } else if (!tytul.equals(other.tytul))
            return false;
        if (czasTrwania != other.czasTrwania)
            return false;
        if (gatunek == null) {
            if (other.gatunek != null)
                return false;
        } else if (!gatunek.equals(other.gatunek))
            return false;
        return true;
    }

    
    
}

