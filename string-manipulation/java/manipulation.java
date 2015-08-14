public class manipulation{
public static void main(String[] args){
    String changeCase = "text to change";
    String Word1 = "Ape";
    String Word2 = "App";
    int outcome;
    
    System.out.println(changeCase);
    
    String result;
    result = changeCase.toUpperCase();
    
    System.out.println(result);
    //or the code on line 12 does the same thing
    System.out.println(changeCase.toUpperCase());
    System.out.println(changeCase.toLowerCase());
    
    //The following compares hexadecimal values of the words Ape and App to see which should come first:
    outcome = Word1.compareTo(Word2);
    
    if(outcome < 0){
        System.out.println("Word1 is less than Word2");
    }
    else if(outcome > 0){
        System.out.println("Word1 is more than Word2");
    }
    else if(outcome == 0){
        System.out.println("The same word");
    }
    /*The following sees if there is an @ symbol in an e-mail address, if it's not there, the output is -1, otherwise
    it will print out the number for the location in the string in this case six, since the first letter of the string is 0:*/
    char ampersand = '@';
    String email_address = "coffee@me.com";
    
    int delivery;
    delivery = email_address.indexOf(ampersand);
    
    System.out.println(delivery);
    //The following if/else statement tests to see if the ampersand is in the e-mail address, if it's not, then it's invalid.
    if(delivery == -1){
        System.out.println("Invalid e-mail address");
    }
    else{
        System.out.println("Email address OK");
    }
    }
}
