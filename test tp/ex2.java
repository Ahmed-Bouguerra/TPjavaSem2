import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n2 = 0; 
        
        System.out.print("Choisissez une opération (+, -, *, /) : ");
        String operateur = scanner.nextLine();

        System.out.print("Entrez le premier nombre : ");
        int n1 = scanner.nextInt();

        if(operateur.equals("/")) {
            do {
                System.out.print("Entrez le second nombre (différent de 0) : ");
                n2 = scanner.nextInt();
                if (n2 == 0) {
                    System.out.println("Erreur : division par zéro !");
                }
            } while(n2 == 0);
        } else {
            System.out.print("Entrez le second nombre : ");
            n2 = scanner.nextInt();
        }

        int resultat = 0;
        boolean valide = true;

        switch (operateur) {
            case "+":
                resultat = addition(n1, n2);
                break;
            case "-":
                resultat = soustraction(n1, n2);
                break;
            case "*":
                resultat = multiplication(n1, n2);
                break;
            case "/":
                resultat = division(n1, n2);
                break;
            default:
                System.out.println("Opération invalide !");
                valide = false;
        }

        if (valide) {
            System.out.println("Résultat : " + resultat);
        }

        scanner.close();
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}