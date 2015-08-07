public class fibonachi{
    public static void main(String[] args) {

     int prevVal = 1;
     int nextVal = 0;
     int count = 0;
     do{
         int start = prevVal + nextVal;
         nextVal = prevVal;
         prevVal = start;
         System.out.print(start+" ");
         count++;
     }
     
         while(count<11);
    }    
}
