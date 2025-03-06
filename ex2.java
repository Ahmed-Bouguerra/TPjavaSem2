import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String ch;
        String ch1="";
        int i;
        do{
            System.out.println("entrer une chaine : ");
            ch = sr.nextLine();
        }while(ch.length() > 30);
        ch=ch.toLowerCase();
        for(i=0;i<ch.length();i++){
            if(ch.charAt(i)=='x'){
                ch1+="a";
            }
            else if(ch.charAt(i)=='y'){
                ch1+="b";
            }
            else if(ch.charAt(i)=='z'){
                ch1+="c";
            }
            else{
                ch1+=(char)(((int)ch.charAt(i))+3);
            }
        }
        System.out.println(ch1);
        sr.close();
    }
}