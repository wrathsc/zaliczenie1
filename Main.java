import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {    

       Scanner scan = new Scanner(System.in);
      System.out.println("napisz zdanie ");
        String tekst=scan.nextLine();    
      
            
        tekst = tekst.replaceAll("\\s+", "");    
            
        System.out.println("tekst po usunieciu spacji: " + tekst);    
    }    
}    
          
