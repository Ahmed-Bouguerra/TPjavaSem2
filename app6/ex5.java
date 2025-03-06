import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String ch;
        String ch1="";
        System.out.println("entrer un chaine : ");
        ch= sr.nextLine();
        int i;
        for(i=0;i<ch.length();i++){
            ch1+=ch.charAt(i)+"*";
        }
        System.out.println("la nouvelle chaine est : "+ch1);
    }
}