import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidencijaPolaznika {

    private static List<Polaznik> polaznici = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int izbor;

        do {
            System.out.println("1. Dodaj novog polaznika");
            System.out.println("2. Svi polaznici na tečaju");
            System.out.println("3. Pretraživanje polaznika po e-mail adresi");
            System.out.println("4. Izlaz iz programa");
            System.out.print("Upišite svoj izbor opcija: ");
            izbor = scanner.nextInt();
            scanner.nextLine();

            switch (izbor) {
                case 1:
                    dodavanjePolaznika(scanner);
                    break;
                case 2:
                    listaPolaznika();
                    break;
                case 3:
                    pretragaPolaznika(scanner);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pogrešan izbor, pokušajte ponovno.");
            }
        } while (izbor != 4);

        scanner.close();
    }

    private static void dodavanjePolaznika(Scanner scanner) {

        System.out.print("Upišite ime polaznika: ");
        String ime = scanner.nextLine();

        System.out.print("Upišite prezime polaznika: ");
        String prezime = scanner.nextLine();

        System.out.print("Upišite e-mail polaznika: ");
        String email = scanner.nextLine();

        Polaznik polaznik = new Polaznik(ime, prezime, email);
        if (polaznici.contains(polaznik)) {
            System.out.println("Polaznik s tim e-mailom već postoji!");
        } else {
            polaznici.add(polaznik);
            System.out.println("Polaznik je dodan!");
        }
    }

    private static void listaPolaznika() {

        if (polaznici.isEmpty()) {
            System.out.println("Nema polaznika!");
        } else {
            System.out.println("Lista polaznika:");
            for (Polaznik polaznik : polaznici) {
                System.out.println(polaznik);
            }
        }
    }

    private static void pretragaPolaznika(Scanner scanner) {

        System.out.print("Upišite e-mail za pretragu: ");
        String email = scanner.nextLine();

        for (Polaznik polaznik : polaznici) {
            if (polaznik.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Pronađen je polaznik: " + polaznik);
                return;
            }
        }
        System.out.println("Nije pronađen polaznik s tom e-mail adresom!");
    }
}
