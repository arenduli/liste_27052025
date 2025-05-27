import java.util.Objects;

public class Polaznik {

    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Polaznik {" +
                "ime = '" + ime + '\'' +
                ", prezime = '" + prezime + '\'' +
                ", e-mail = '" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polaznik polaznik = (Polaznik) o;
        return Objects.equals(email, polaznik.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
