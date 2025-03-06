import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        String ch;
        int i;
        Scanner sr = new Scanner(System.in);
        System.out.println("Entrez une chaine :");
        ch = sr.nextLine();
        boolean t=true;
        for(i=0;i<ch.length()/2;i++){
            if(ch.charAt(i) != ch.charAt(ch.length()-i-1)){
                t=false;
            }
        }
        if(t==true){
            System.out.println(ch+" est palandrome");
        }
        else{
            System.out.println(ch+" n'est pas palandrome");
        }
    }
}