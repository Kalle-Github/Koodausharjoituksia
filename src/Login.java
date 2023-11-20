import java.util.Scanner;


public class Login {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Syötä etunimi: ");
        String firstName = scanner.nextLine();

        System.out.print("Syötä sukunimi: ");
        String lastName = scanner.nextLine();

        System.out.print("Syötä yrityksen verkkotunnus: ");
        String domain = scanner.nextLine();

        if (firstName.isEmpty() || lastName.isEmpty() || domain.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
            return;
        }

        GenerateEmail(firstName, lastName, domain);

        GenerateUsername(firstName, lastName);
    }

    public static void GenerateEmail(String firstName, String lastName, String domain) {
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain;
        System.out.println("Sähköpostiosoite: " + email);
    }

    public static void GenerateUsername(String firstName, String lastName) {
        String username = firstName.substring(0, Math.min(firstName.length(), 4))
                + lastName.substring(Math.max(0, lastName.length() - 4));
        System.out.println("Käyttäjätunnus: " + username.toLowerCase());
    }
}
