import java.util.Scanner;
public class swapping{
    public static void main(String[] args){
        //String FullName = "Steve Forbes";
        String FirstNameChars = "";
        String LastNameChars = "";
        String FirstTwoChars = "";
        
        //The next three lines of code was added last to allow for user input instead of having Steve Forbes as the default name.
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a First Name and Last Name:");
        String FullName = user_input.nextLine();
        
        FirstNameChars = FullName.substring(0,1);
        LastNameChars = FullName.substring(6,7);
        FirstTwoChars = FullName.substring(0,2);
        
        System.out.println(FirstNameChars);
        System.out.println(LastNameChars);
        System.out.println(FirstTwoChars);
        
        // Code below finds the space in var FullName between Steve and Forbes. Remember to type the space to be found as " " and not ""
        int spacePos = FullName.indexOf(" ");
        System.out.println("Space is at pos " + spacePos);
        
        String LsNameChars = "";
        LsNameChars = FullName.substring(spacePos + 1, (spacePos + 1) + 2);
        System.out.println(LsNameChars);
        
        String OtherFirstChars ="";
        OtherFirstChars = FullName.substring(2, spacePos);
        System.out.println("other first:" + OtherFirstChars);
        
        String OtherLsNameChars = "";
        OtherLsNameChars = FullName.substring((spacePos + 1) + 2);
        FullName.length();
        
        System.out.println("other second:" + OtherLsNameChars);
        
        String NewName = "";
        NewName = LsNameChars + OtherFirstChars + " " + FirstNameChars + OtherLsNameChars;
        System.out.println("New Name = " + NewName);
        
        System.out.println("I mean Teve Torbes! ;)");
    }  
}
