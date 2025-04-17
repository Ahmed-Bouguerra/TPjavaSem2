import java.util.Scanner;

public class ex3 {
    public static boolean estInfinitif(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }
    public static int Groupe(String verbe) {
        if (!estInfinitif(verbe)) {
            return -1;
        }

        if (verbe.endsWith("er") && !verbe.equals("aller")) {
            return 1;
        } else if (verbe.endsWith("ir")) {
            String[] deuxiemeGroupe = {"finir", "choisir", "réussir", "grandir", "rougir", "grossir"};
            for (String v : deuxiemeGroupe) {
                if (verbe.equals(v)) {
                    return 2; 
                }
            }
        }

        return 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un verbe à l'infinitif : ");
        String verbe = scanner.nextLine().toLowerCase();

        if (!estInfinitif(verbe)) {
            System.out.println("Ce verbe n'est pas à l'infinitif !");
        } else {
            int groupe = Groupe(verbe);
            System.out.println("Le verbe appartient au " + groupe + " groupe.");
        }

        scanner.close();
    }
}
