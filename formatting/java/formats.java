public class formats{
    public static void main(String[] args){
        String heading = "Language";
        String heading_1 = "Awesomesauce grade?";
        
        System.out.printf("%-15s %15s %n", heading, heading_1);
        
        int i = 0;
        while (i < 36){
            System.out.print("-");
            i++;
        }
        String lang = "Java";
        String lang1 =  "PHP";
        String lang2 = "VB NET";
        char grade = 'A';
        char grade1 = 'B';
        
        System.out.println();
        System.out.printf("%-15s %15s %n", lang, grade);
        System.out.printf("%-15s %15s %n", lang1, grade1);
        System.out.printf("%-15s %15s %n", lang2, grade);
        
        int n = 0;
        while (n < 36){
            System.out.print("-");
            n++;
        }
        System.out.println();
        System.out.printf("%s %25d %n", "Total:", 100);
        System.out.printf("%-10d %23d %n", 22334, 34573);
        System.out.printf("%010d %23d %n", 22334, 34573);
        System.out.printf("%f %n", 345.73);
        System.out.printf("%.2f %n", 34.573); //doing 34.576 would return 34.58
    } 
}
