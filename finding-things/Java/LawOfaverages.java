import java.util.Arrays;
public class LawOfaverages{
    public static void main(String[] args){
        int [] num = {23, 6, 47, 35, 2, 14};
        int largest = Integer.MIN_VALUE; 
        
        System.out.print("The numbers in the array: "); System.out.println(Arrays.toString(num));

        System.out.println("The total average of all numbers in the array: " + (num[0] + num[1] + num[2] + num[3] + num[4] + num[5]) / num.length);
        //The following for loop finds the largest number in the array and line 15 prints that value out
        for(int i = 0; i < num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        System.out.println("The largest number in the array: " + largest);
        System.out.print("The odd numbers in the array: ");
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                //Does nothing (this is designed to find and print odd numbers, although it might not be the most efficient way)
            }
            else{
                System.out.print(num[i] + " ");
            }
        }
    }
}
