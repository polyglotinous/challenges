import javax.swing.JOptionPane;

public class stringcheck{
    public static void main(String[] args){
        String colorinput;
        colorinput = JOptionPane.showInputDialog("Type in one of the following: Red, Blue, Black, or White");
        
        if(colorinput.equals("Blue")){
            System.out.println("Happy Happy Town :)");
        }
        else if(colorinput.equals("Red")){
            System.out.println("You're a commie aren't you!");
        }
        else if(colorinput.equals("Black")){
            System.out.println("I like black jackets!");
        }
        else if(colorinput.equals("White")){
            System.out.println("You look nice!");
        }
    }   
}
