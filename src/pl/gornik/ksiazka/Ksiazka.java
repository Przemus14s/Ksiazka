package pl.gornik.ksiazka;

public class Ksiazka {
    String tytul;
    String kategoria;
    int iloscStron;
    double cena;
    int liczbaSztuk;

    public Ksiazka(String tytul, String kategoria, double cena, int iloscStron, int liczbaSztuk) {
        this.tytul = tytul;
        this.kategoria = kategoria;
        this.iloscStron = iloscStron;
        this.cena = cena;
        this.liczbaSztuk = liczbaSztuk;
    }

    public String wypiszInformacje() {
        String wypisz;
        wypisz = tytul + " należy do " + kategoria + " i ma " + iloscStron + " stron";
        return wypisz;
    }

    public String obliczKwote() {
        String wypisz1;
        double cenaZaJednaSztuke = cena / liczbaSztuk;
        wypisz1 = "Kwota za jedna sztuke " + tytul + " kosztuje " + cenaZaJednaSztuke;
        return wypisz1;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", iloscStron=" + iloscStron +
                ", cena=" + cena +
                ", liczbaSztuk=" + liczbaSztuk +
                '}';
    }
}


