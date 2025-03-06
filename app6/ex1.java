import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String ch;
        char x;
        int i;
        int nb = 0;

        System.out.println("Entrez une chaine :");
        ch = sr.nextLine();

        System.out.println("Donnez-moi le caractere a chercher :");
        x = sr.next().charAt(0); 

        for (i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == x) {
                nb++;
            }
        }

        System.out.println("Le nombre d'occurences du caractere (" + x + ") est " + nb + " fois");

        sr.close(); 
        }
}