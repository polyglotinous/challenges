import java.util.Arrays;
public class Sortarray{
    public static void main(String[] args){
        int i;
        int[] aryNums = {10, 14, 36, 27, 43, 18};
        Arrays.sort(aryNums); //sorts in ASCENDING order beginnging with the smallest number
        
        for (i = 0; i < aryNums.length; i++){
            System.out.println("num:" + aryNums[i]);
        }
    }    
}
