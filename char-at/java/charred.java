import java.util.Scanner;
public class charred{
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        
        System.out.println("Quit Y/N");
        
        String aString = user_input.next();
        
        char aChar = aString.charAt(0);
        
        if (aChar == 'Y'){
            System.out.println("OK, BYE BYE");
        }
        else{
            System.out.println("Not Quitting");
        }
    }
}
