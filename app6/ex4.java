import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String ch;
        String ch1="";
        int i;
        System.out.println("entrer une chaine : ");
        ch = sr.nextLine();
        for(i=ch.length()-1;i>=0;i--){
            ch1+=ch.charAt(i);
        }
        System.out.println("la nouvelle chaine est : "+ch1);
    }
}