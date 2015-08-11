public class forloops{
    public static void main(String[] args){
        int loopVal;
        
        for(loopVal = 0; loopVal <= 100; loopVal++){
            
            System.out.println("Loop Value = " + loopVal);
          
            switch(loopVal){
                case 1:
                    System.out.println("You were born!");
                    break;
                case 5:
                    System.out.println("You're old enough to be in Kindergarten!");
                    break;
                case 14:
                    System.out.println("You're old enough to be in High School!");
                    break;
                case 15:
                    System.out.println("You're old enough to drive!");
                    break;
                case 18:
                    System.out.println("You're old enough to be an adult!");
                    break;
                case 21:
                    System.out.println("You're old enough to drink alcohol!");
                    break;
                case 35:
                    System.out.println("You're old enough to run for President!");
                    break;
                case 65:
                    System.out.println("You're old enough to retire!");
                    break;
                case 100:
                    System.out.println("You've old lived an entire century!");
                    break;
            }
        }
    }   
}
