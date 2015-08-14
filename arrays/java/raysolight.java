import java.util.Arrays;
public class raysolight{
    public static void main(String[] args){
        int[] num = {10, 14, 36, 27, 43, 18};
        String[] str = new String[4];
        
        str[0] = "quack ";
        str[1] = "quack ";
        str[2] = "like a ";
        str[3] = "duck";
        
        System.out.println("Str length is " + str.length);
        System.out.println("num length is " + num.length);
        System.out.println("Array str stores: " + str[0] + str[1] + str[2] + str[3]);
        System.out.println("Array num stores: " + num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4] + " " + num[5]);
        str[3] = "horse";
        System.out.println("str[3], which had 'duck' in it now has: " + str[3]);
        System.out.println("Array str stores: " + str[0] + str[1] + str[2] + str[3]);
        str[0] = "neigh "; str[1] = "neigh ";
        System.out.println("Array str now stores: " + str[0] + str[1] + str[2] + str[3]);
        
        boolean[] aryBools = new boolean[]{false, true, false, true};
        System.out.println("aryBools stores boolean values like: " + aryBools[0] + " " + aryBools[1]);
        
        Arrays.sort(str);
        int i;
        for (i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        Arrays.sort(num);
        for(i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }    
}
