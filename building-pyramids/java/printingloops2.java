public class printingloops2{
    public static void main(String[] args){
        int count = 1;
        String dot = "*";
        String space = "                                        ";
        
        while (count < 40){
           
            System.out.print(space);
            space = space.concat("\b");
            System.out.println(dot);
            dot = dot.concat("**");
            count++;
        }
    }
}
