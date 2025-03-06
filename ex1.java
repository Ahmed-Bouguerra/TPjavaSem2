import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String ch,x,y;
        String ch1="";
        String ch2="";
        do{
            System.out.println("entrer une chaine : ");
            ch = sr.nextLine();
        }while(ch.length() >=50);
        ch+=" ";
        do{
            System.out.println("entrer le mot pour le remplacer : ");
            x=sr.nextLine();
        }while(x.length()>=10);
        do{
            System.out.println("entrer le mot de remplissage : ");
            y=sr.nextLine();
        }while(y.length()>=10);
        while(ch.length()>0 && ch.contains(" ")){
            ch2=ch.substring(0,ch.indexOf(" "));
            if(ch2.equals(x)){
                ch1=ch1+y+" ";
            }
            else{
                ch1=ch1+ch2+" ";
            }
            ch=ch.substring(ch.indexOf(" ")+1,ch.length());
        }
        System.out.println(ch1);
        sr.close();
    }
}