import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donnez un verbe du premier groupe (ex: chanter) : ");
        String verbe = scanner.nextLine().trim();
        if (!verbe.endsWith("er") || verbe.equals("aller")) {
            System.out.println("Ce n'est pas un verbe régulier du premier groupe !");
            String radical = verbe.substring(0, verbe.length() - 2);
            System.out.println("Conjugaison de " + verbe + " au présent :");
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radical + "ons");
            System.out.println("Vous " + radical + "ez");
            System.out.println("Ils/Elles " + radical + "ent");
        }

        scanner.close();
    }
}