import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String ch;
        System.out.println("Entrez une chaine : ");
        ch = sr.nextLine();
        System.out.println("la premier premier mot est : "+ch.substring(0,ch.indexOf(" ")));
    }
}