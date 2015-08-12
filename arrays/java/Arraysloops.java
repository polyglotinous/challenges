import java.util.Scanner;
public class Arrayloops{
    public static void main(String[] args){
        int[] draft_numbers = new int[49];
        int i = 0;
        
        System.out.println("Type any number 1 - 6");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        for (i = 0; i < draft_numbers.length; i++){
            draft_numbers[i] = i + 1;
        }
        System.out.println("Draft numbers picked: " + draft_numbers[1] / num + ", " + draft_numbers[25] / num + ", " + draft_numbers[34] + ", " + draft_numbers[46] / num + ", " + draft_numbers[4] + ", " + draft_numbers[29]);
    } 
}
