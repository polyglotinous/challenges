public class equality{
    public static void main(String[] args){
        String email_address1 = "meme@me.cob";
        String email_address2 = "meme@me.com";
        Boolean isMatch = false;
        
        isMatch = email_address1.equals(email_address2);
        
        if (isMatch == true){
            System.out.println("Email Address Match ");
        }
        else{
            System.out.println("Email addresses don't match");
        }
        int num = 28;
        int num2 = 27;
        Integer num_1 = new Integer(num);
        Integer num_2 = new Integer(num2);
        
        Boolean NumMatch = num_1.equals(num_2);
        
        if (NumMatch == true){
            System.out.println("Numbers match ");
        }
        else{
            System.out.println("Numbers don't match");
        } 
    } 
}
